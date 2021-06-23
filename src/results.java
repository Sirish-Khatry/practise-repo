
public class results {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bio = 150;
		int chem= 89;
		int phy = 89;

		System.out.println("Overall Percentage:- " + percentage(bio, chem, phy)+ "%");
		
		boolean check = true;
		System.out.println("Total: " + booleanChecker(2, 3, check));
		test(300);
		System.out.println("BlackJack " + blackJack(1, 21));
		System.out.println("UniqueSum " + uniqueSum(1, 3, 3));
	
	}
	
	/// EXAMS EXERCISE
	
	public static double percentage(double bio, double chem, double phy) {
		
		double score = bio + chem + phy;
		double percentage = score * 100 / 450;
		double roundOff = Math.round(percentage * 100.0) / 100.0;
		
		if (roundOff < 60) {
			
			System.out.println("You Have Failed All Subjects");
		}
		
		else if (roundOff >= 60) {
			
			int failed = 0;
			String subject = "";
			
			if (bio < 90) {
				failed++;
				subject = subject + " Bio";
			}
			 if (chem < 90) {
				failed++;
				subject = subject + " Chemistry";
			}
			if (phy < 90) {
				failed ++;
				subject = subject + " Physics";
			}
			
			System.out.println("You have failed " + failed + " subject which are" + subject);
	
		}
		
		return roundOff;
	}
	
	/// BOOLEAN EXERCISE
	
	public static int booleanChecker(int one, int two, boolean check) {
		int total = 0;
		if(check) {
			total = one + two;
		}
		else {
			total = one * two;
		}
		
		return total;
		
	}
	
	//// FLOW CHART
	
	public static void test( int a) {
		
		if(a > 2000) { //if 1
	
			System.out.println("A");
			
			if(a > 6000) {
				System.out.println("C");
			}
			
			else {
				System.out.println("B");
				if(a > 4000) {
					System.out.println("D");
				}
				else {
					System.out.println("E");
				}
			}
		}
	
		else { // else 1
			System.out.println("1");
			if(a > 100) {
				System.out.println("3");
				if(a > 600) {
					System.out.println("5");
				}
				else {
					System.out.println("4");
					if(a > 500) {
						System.out.println("6");
					}
					else {
						System.out.println("7");
					}
				}
			}		
			else {
				System.out.println("2");
			}
		}

	}
	
	///// BLACK JACK
	public static int blackJack(int one, int two) {
	
		if (one > 21) {
			one = 0;
		}
		if (two > 21) {
			two = 0;
		}
		
		int result;
		
		if (one > two) {
			result = one;
		}
		
		else {
			result = two;
		}

		return result;
	}
	
	/// UNIQUE SUM
	
	public static int uniqueSum(int a, int b, int c) {
		int sum = 0;
		
		if ( a == b && a == c) {
			sum = 0;
		}
		else if( a == b) {
			sum = c;
		}
		
		else if ( b == c) {
			sum = a;
		}
		
		else {
			sum = a + b + c;
		}
		
		
		return sum;
	}
	

}
