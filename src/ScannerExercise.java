import java.util.Scanner;

public class ScannerExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Double n1, n2;
		String choice;
		
		System.out.println("Which method do you want to use? Enter addition, substraction, multiplication or division!");	
		choice = scan.nextLine();
		
		System.out.println("Enter first Number");
		 n1 = scan.nextDouble();
		
		System.out.println("Enter second Number");
		 n2 = scan.nextDouble();
		 
		 
		if(choice.equals("addition")) {
			System.out.println("Addition is: " + addition(n1, n2));
		}
		else if(choice.equals("substraction")) {

			System.out.println("Substraction is: " + substraction(n1, n2));
		}
		
		else if(choice.equals("multiplication")) {

			System.out.println("Multiplication is: " + multiplication(n1, n2));
		}
		
		else if(choice.equals("division")) {

			System.out.println("Division is: " + division(n1, n2));
		}
		
		else {
			System.out.println("Invalid method or number");
		}
		
		scan.close();
	
		
	}	
	
	public static double addition(Double n1, Double n2) {
		
		double result;
		result = n1 + n2;
		
		return result;
		
	}
	
	public static double substraction(Double n1, Double n2) {
		double result;
		
		result = n1 - n2;
		
		return result;
		
	}

	public static double multiplication(Double n1, Double n2) {
		double result;
		
		result = n1 * n2;
		
		return result;
		
	}
	
	public static double division(Double n1, Double n2) {
		double result;
		
		result = n1 / n2;
		
		return result;
		
	}



}
