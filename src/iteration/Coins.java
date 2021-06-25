package iteration;

public class Coins {

	public static void main(String[] args) {
		
		double price = 5.80;
		double payment = 20.0;
		
		   if(price > payment) {
			   System.out.println("Not enough money given");
		   }
		   
		   else {
			   int change = (int) ((payment - price) * 100); 
			   changeDue(change);  //Converting change from double into int to get rid of floating point, and converting the change into pennies for easier calculation
		   }

	}

	private static void changeDue(int change) {
		// TODO Auto-generated method stub
		
		if (change / 2000 >= 1) {
			System.out.println((change - (change % 2000)) / 2000 + "x £20 Note"); 
			 changeDue(change % 2000);
		}
		
		else if (change / 1000 >=1) {
			System.out.println((change - (change % 1000)) / 1000 + "x £10 Note"); 
			 changeDue(change % 1000);  // 1429 / 100 is greater than 1 so we go inside this clause, 1420 % 1000 = 420, then 1420 - 420 = 1000 then 1000 / 1000 = 1 so we will need 1 £10 note
		}                                // then we run the method again by providing the remaining change which is 1420/1000 = 420 and it carries on like that until change == 0
		
		else if (change / 500 >=1) {
			System.out.println((change - (change % 500)) / 500 + "x £5 Note");
			 changeDue(change % 500);
		}
		
		else if (change / 200 >= 1) {
			System.out.println((change - (change % 200)) / 200 + "x £2 Coin");
			 changeDue(change % 200);
		}
		
		else if (change / 100 >= 1) {
			System.out.println((change - (change % 100)) / 100 + "x £1 Coin");
			 changeDue(change % 100);
		}
		
		else if (change / 50 >= 1) {
			System.out.println((change - (change % 50)) / 50 + "x £0.50p Coin");
			 changeDue(change % 50);
		}
		
		else if (change / 20 >= 1) {
			System.out.println((change - (change % 20)) / 20 + "x £0.20p Coin");
			 changeDue(change % 20);
		}
		
		else if (change / 10 >= 1) {
			System.out.println((change - (change % 10)) / 10 + "x £0.10p Coin");
			 changeDue(change % 10);
		}
		
		else if (change / 5 >= 1) {
			System.out.println((change - (change % 5)) / 5 + "x £0.5p Coin");
			 changeDue(change % 5);
		}
		
		else if (change / 2 >= 1) {
			System.out.println((change - (change % 2)) / 2 + "x £0.2p Coin");
			 changeDue(change % 2);
		}
		
		else if (change / 1 >= 1) {
			System.out.println((change - (change % 1)) / 1 + "x £0.1p Coin");
			 changeDue(change % 1);
		}
	}
	
	// Hints and idea from -- http://www2.hawaii.edu/~esb/2021spring.ics211/ChangeDue.java.html
	
	

}
