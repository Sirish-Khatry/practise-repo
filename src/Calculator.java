
public class Calculator {
	
	public static void main(String[] args) {
		
		int bio = 120;
		int chem= 110;
		int phy = 100;

		System.out.println("Addition: " + addition(6,4));
		System.out.println("Substraction: " + subtraction(6,4));
		System.out.println("Division: " + division(6,4));
		System.out.println("Multiplication: " + multiplication(6,4));
		System.out.println("Biology:- " + bio);
		System.out.println("Chemistry:- " + chem);
		System.out.println("Physics:- " + phy);
		System.out.println("Overall Percentage:- " + percentage(bio, chem, phy)+ "%");
		
		
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
		
		double total = num1 / num2;
		
		return total;
	}
	
	public static int multiplication(int num1, int num2) {
		
		int total = num1 * num2;
		
		return total;
	}
	public static double percentage(double bio, double chem, double phy) {
		
		double score = bio + chem + phy;
		double percentage = score * 100 / 450;
		double roundOff = Math.round(percentage * 100.0) / 100.0;
		
		return roundOff;
	}
	
	
}
