package Exceptions;

class Account {
	private int accountNo;
	private String name;
	private double balance;

	public Account(int accountNo, String name, double balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double withdraw(int amount) {
		try{
			if(this.balance-amount <0) {
				throw new InsufficentBalance();
			}
			this.balance -= amount;
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return balance;
	}
}

class InsufficentBalance extends ArithmeticException {
	@Override
	public String toString() {
		return "OOPS! Looks like you don't have enough balance";
	}
}
public class CustomException {
	public static void main(String[] args) {
		Account a1 = new Account(101, "Akash", 12000);
		System.out.println(a1.withdraw(2000));
		System.out.println(a1.withdraw(11000));
	}

}
