package partE;

public class SavingsAccount extends Account {
    private double interestRate;
    private double balance;
    private String accountId;

    public SavingsAccount(String accountId, double interestRate, double balance) {
        this.accountId = accountId;
        this.balance = balance;
        this.interestRate = interestRate;
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
        return getBalance() + (interestRate * getBalance());
    }
}
