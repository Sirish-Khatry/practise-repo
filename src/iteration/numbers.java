package iteration;

public class numbers {

	public static void main(String[] args) {

		System.out.println(printDigitAlpha(18));
		
	}
	
	public static String printDigitAlpha(int digit){
		
		if(digit < 0) {
			return "Please enter a valid number above 0";
		}
		else if(digit < 20) {
			return smallDigit(digit);
		}
		else if(digit < 30) {
			return "Twenty-" + smallDigit(digit - 20);
		}
		else if(digit < 40) {
			return "Thirty-" + smallDigit(digit - 30);
		}
		else if(digit < 50) {
			return "Fourty-" + smallDigit(digit - 40);
		}
		else if(digit < 60) {
			return "Fifty-" + smallDigit(digit - 50);
		}
		else if(digit < 70) {
			return "Sixty-" + smallDigit(digit - 60);
		}
		else if(digit < 80) {
			return "Seventy-" + smallDigit(digit - 70);
		}
		else if(digit < 90) {
			return "Eighty-" + smallDigit(digit - 80);
		}
		else if(digit < 100) {
			return "Ninety-" + smallDigit(digit - 90);
		}
		else if(digit < 1000 && digit % 100 == 0) {
			return printDigitAlpha(digit / 100) + "-Hundred"; ///dividing the number by 100 to get the first digit
		}
		
		else if(digit < 1000) {
			return "";
		}
		
		else {
			return "";
		}
		
	}
   

    public static String smallDigit(int digit) {
    	
//    	for (int i = 19; i > 0 ; i--) {
//    		System.out.println(i);
//    	}
    	
    	if(digit == 1) {
    		return "One";
    	}
    	else if(digit == 2) {
    		return "Two";
    	}
    	else if(digit == 3) {
    		return "Three";
    	}
    	else if(digit == 4) {
    		return "Four";
    	}
    	else if(digit == 5) {
    		return "Five";
    	}
    	else if(digit == 6) {
    		return "Six";
    	}
    	else if(digit == 7) {
    		return "Seven";
    	}
    	else if(digit == 8) {
    		return "Eight";
    	}
    	else if(digit == 9) {
    		return "Nine";
    	}
    	else if(digit == 10) {
    		return "Ten";
    	}
    	else if(digit == 11) {
    		return "Eleven";
    	}
    	else if(digit == 12) {
    		return "Twelve";
    	}
    	else if(digit == 13) {
    		return "Thirteen";
    	}
    	else if(digit == 14) {
    		return "Fourteen";
    	}
    	else if(digit == 15) {
    		return "Fifteen";
    	}
    	else if(digit == 16) {
    		return "Sixteen";
    	}
    	else if(digit == 17) {
    		return "Seventeen";
    	}
    	else if(digit == 18) {
    		return "Eightteen";
    	}
    	else if(digit == 19) {
    		return "Nineteen";
    	}
    	else {
    		return "";
    	}

    }
    
    }