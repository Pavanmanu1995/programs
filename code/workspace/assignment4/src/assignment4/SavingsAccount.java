package assignment4;

public class SavingsAccount {
	double balance;
	int interestRate;
	int accountNo;
	public SavingsAccount() {
		super();
	}
	public SavingsAccount(double balance, int interestRate, int accountNo) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	

}
