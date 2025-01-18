package partE;

public class CheckingAccount extends Account {
    private double monthlyFee;
    private double balance;
    private String accountId;

    public CheckingAccount(String accountId, double monthlyFee, double balance) {
        this.accountId = accountId;
        this.balance = balance;
        this.monthlyFee = monthlyFee;
    }

    @Override
    public String getAccountId() {
        return accountId;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return balance - monthlyFee;
    }
}
