package basicJavaPrograms;

public class BankAccount {
	int accountNumber = 123456789;
	double balance = 50.0;
	String customerName = "Jesse Shen";
	String email = "zephyrstx@gmail.com";
	String phoneNumber = "4086566106";
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public BankAccount (int accountNumber, double balance, String customerName, String email, String phoneNumber){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public double getBalance(){
		System.out.println("The account balance is: " + this.balance);
		return this.balance;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	

	public void deposit(double amount){
		if (amount > 50){
			System.out.println("Exceeds the daily limit.");
		} else{
			this.balance += amount;
			System.out.println("Deposit Successful! Current balance is: " + this.balance);
		}
	}
	public void withdraw(double amount){
		if (amount > this.balance){
			System.out.println("There isn't sufficient balance in the account.");
		} else{
			this.balance -= amount;
			System.out.println("Withdraw Successful! Current balance is: " + this.balance);
		}
	}
	//Create another method to print Customer Name, Account Number, Balance, Email and Phone Number
	public void informationPrint(){
		System.out.println("Customer Name: " + this.customerName);
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Balance: " + this.balance);
		System.out.println("Email: " + this.email);
		System.out.println("Phone Number: " + this.phoneNumber);
		System.out.println();
	}
	
}
