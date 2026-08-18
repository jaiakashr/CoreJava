package Practices;

abstract class BankAccount{
	private int AccountNumber;
	private String HolderName;
	private double Balance;
	
	public BankAccount(int AccountNumber, String HolderName, double Balance) {
		this.AccountNumber = AccountNumber;
		this.HolderName = HolderName;
		this.Balance = Balance;
	}
	
	//Getters
	public int getAccountNumber() {
		return AccountNumber;
	}
	public String getHolderName() {
		return HolderName;
	}
	public double getBalance() {
		return Balance;
	}
	
	//Setters
	public void setAccountNumber(int AccountNumber) {
		this.AccountNumber = AccountNumber;
	}
	public void setHolderName(String HolderName) {
		this.HolderName = HolderName;
	}
	public void setBalance(double Balance) {
		this.Balance = Balance;
		
	}
	
	abstract double calculateInterest();
}
class CurrentAccount extends BankAccount {
	public CurrentAccount(int AccountNumber, String HolderName, double Balance) {
		super(AccountNumber, HolderName, Balance);
	}

	@Override
	double calculateInterest() {
		return getBalance() * 0.02;
	}
	
}

class SavingsAccount extends BankAccount{
	public SavingsAccount(int AccountNumber, String HolderName, double Balance) {
		super(AccountNumber, HolderName, Balance);
	}

	@Override
	double calculateInterest() {
		return getBalance() * 0.04;
	}
}


public class BankSystem {
	
	public static void main(String[] args) {
		BankAccount account = new SavingsAccount(2502, "Akash", 22000);
		
		System.out.println("Account Number " + account.getAccountNumber());
		System.out.println("Account Holder Name " + account.getHolderName());
		System.out.println("Balance " + account.getBalance());
		
		System.out.println("Interst " + account.calculateInterest());
	}

}

//
//Inheritance	--->  SavingsAccount extends BankAccount
//Encapsulation ...>  private fields + getters/setters
//Abstraction	--->  abstract calculateInterest()
//Polymorphism  --->  BankAccount account = new SavingsAccount(...)
