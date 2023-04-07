public class Account {
    private String accountId;
    private String name;
    private double amount;

    public Account() {
    }

    public Account(String accountId, String name, double amount) {
        this.accountId = accountId;
        this.name = name;
        this.amount = amount;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
