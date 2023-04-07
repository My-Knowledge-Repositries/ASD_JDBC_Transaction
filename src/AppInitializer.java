import java.sql.SQLException;
import java.util.Date;

public class AppInitializer {
    public static void main(String[] args) {
        CrudManager crudManager = new CrudManager();
        Account account = new Account("A-5", "jagath", 50000);
        Payment payment = new Payment("P-5", new Date(), 4500);
        try {
            System.out.println(crudManager.saveData(account, payment));
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
