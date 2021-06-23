
public class Calculator {
	
	public static void main(String[] args) {
		
		System.out.println("Addition: " + addition(6,4));
		System.out.println("Substraction: " + subtraction(6,4));
		System.out.println("Division: " + division(6,2));
		System.out.println("Multiplication: " + multiplication(6,4));

		
		
	}
	
	public static int addition(int num1, int num2) {
		
		int total = num1 + num2;
		
		return total;
	}
	
	public static int subtraction(int num1, int num2) {
		
		int total = num1 - num2;
		
		return total;
	}
	
	public static double division(double num1, double num2) {
		
//		double total = num1 / num2;
//		
//		return total;
		
		if (num2 < num1) {
			double total = num1 / num2;
	
			return total;
		}
		
		else {
			System.out.println("The division cannot be performed");
			return 0;
		}
	}
	
	public static int multiplication(int num1, int num2) {
		
		int total = num1 * num2;
		
		return total;
	}


	
}
