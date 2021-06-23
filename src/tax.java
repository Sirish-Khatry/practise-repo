
public class tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Tax Percentage: " + percentTaxed(47000));
		System.out.println("Exact Amount Taxed: " + amountTaxed(47000));
		fizzBuzz(30);
	}
	

	
	public static int percentTaxed (int salary) {
		int percent = 0;
		
		if(salary < 14999) {
			percent = 0;
		}
		
		else if(salary > 15000 && salary < 19999) {
			percent = 10;
		}
		else if(salary > 20000 && salary < 29999) {
			percent = 15;
		}
		
		else if(salary > 30000 && salary < 44999) {
			percent = 20;
		}
		
		else if(salary > 45000) {
			percent = 25;
		}
		
		
		return percent;
	}
	
	
	public static double amountTaxed(int salary) {
		
		double percent = percentTaxed(salary);
		
		double total = percent / 100 * salary;
		
		return total;
	}
	
	/// FIZZ BUZZ
	
	public static int fizzBuzz(int number) {
		String word = "";
			
		
		if(number % 3 == 0 && number % 5 == 0) {
			word = "FizzBuzz";
			System.out.println(word);
		}
		
		else if (number % 3 == 0) {
			word = "Fizz";
			System.out.println(word);
			
		}
		else if (number % 5 == 0) {
			word = "Buzz";
			System.out.println(word);	
		}
		else {
			System.out.println(number);	
		}
		
		return 0;
	}

}
