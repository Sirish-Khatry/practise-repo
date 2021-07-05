import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0, n2 = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first Number");
		
		try {
			 n1 = scan.nextInt();
			 System.out.println("Enter second Number");
			 n2 = scan.nextInt();	
		} catch(InputMismatchException e) {
			e.printStackTrace();
			 System.out.println(e + " Enter number not alphabet");
			 scan.close();
		}
		
		 System.out.println(division(n1, n2));
		 
		 scan.close();

	}
	
	public static int division(int n1, int n2) throws ArithmeticException {
		int result = 0;
		
		if(n2 > n1) {
			throw new largeDivisorException("Denominator is bigger than numerator");
		}
		
		try {
			result = n1 / n2;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e + " Cannot divide by 0");
		}
		return result;
		
	}

}
