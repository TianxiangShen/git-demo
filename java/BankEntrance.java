package basicJavaPrograms;

public class BankEntrance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba1 = new BankAccount();
		// ba1.informationPrint();
		double balance = ba1.getBalance();
		//System.out.println(balance);
		
		ba1.deposit(20);
		ba1.withdraw(20);
	}

}
