import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudManager {
    public boolean saveData(Account account, Payment payment) throws SQLException, ClassNotFoundException {
        Connection connection = DbConnection.getInstance().getConnection();
        connection.setAutoCommit(false);
        try {
            PreparedStatement preparedStatement1 = connection.prepareStatement(
                    "INSERT INTO account VALUES(?,?,?)"
            );
            preparedStatement1.setString(1, account.getAccountId());
            preparedStatement1.setString(2, account.getName());
            preparedStatement1.setDouble(3, account.getAmount());

            boolean isSaved = preparedStatement1.executeUpdate() > 0;
            if (isSaved) {
                if (true){
                    connection.rollback();
                    return false;
                }
                PreparedStatement preparedStatement2 = connection.prepareStatement(
                        "INSERT INTO payment VALUES(?,?,?,?)"
                );
                preparedStatement2.setString(1, payment.getPayId());
                preparedStatement2.setObject(2, payment.getPayDate());
                preparedStatement2.setDouble(3, payment.getPayment());
                preparedStatement2.setString(4, account.getAccountId());
                if (preparedStatement2.executeUpdate() > 0) {
                    connection.commit();
                    return true;
                }
                connection.rollback();
            }
            return false;
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }
}
