package partE;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> bankAccounts;

	public Employee(String name) {
		this.name = name;
		this.bankAccounts = new ArrayList<Account>();
	}

	public String getName() {
		return name;
	}

	public List<Account> getBankAccounts() {
		return bankAccounts;
	}

	public void addAccount(Account account) {
		bankAccounts.add(account);
	}

	public double computeUpdatedBalanceSum() {
		double sumBalance = 0;
		for (Account account : bankAccounts) {
			sumBalance += account.getBalance();
		}
		return sumBalance;
	}
}
