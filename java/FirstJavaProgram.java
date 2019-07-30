package basicJavaPrograms;

public class FirstJavaProgram {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		int a = 500;
		short b = 10;
		byte c = 30;
		long d = 70000 + a*15 + b + c;
		System.out.println(d);
		
		int p = 100;
		PoundKg(p);
		
		JavaSwitch newSwitch = new JavaSwitch();
		int fruit = 2;
		newSwitch.Switch1(fruit);
	}
	public static void PoundKg(int p){
		double k = p * 0.45359;
		System.out.println(k);
	}
	

}

class JavaSwitch{
	public void Switch1(int fruit){
		switch(fruit){
			case 1:
			    System.out.println("apple");
			    break;
			 case 2:
			    System.out.println("peach");
			    break;
			 case 3:
				System.out.println("grape");
				break;
			 default:
				 System.out.println("There's no fruit in basket");
		
		}
	}
	
}
