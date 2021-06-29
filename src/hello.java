public class hello {
	
	public static void printGreeting(String greeting) {
		System.out.println(greeting);
		
	}

	public static void main(String[] args) {
		
//		printGreeting("Hellow World From Sirish");
//		
//		
//		String input = "home";
//		String text = "";
//		for(int i = 0; i < input.length(); i++) {
//			char c = input.charAt(i);
//		String text2 = "" + Character.toString(c) + Character.toString(c) + Character.toString(c);
//			text = text.concat(text2);
//		}
//		
//		System.out.println(text);
		
		String main = "breadsirishbread";
		String sub = main.replace("bread", "");
		String substring = "";
		
		for(int i = sub.length(); i > 0; i--) {
			String text1 = "" + sub.substring(i-1, i);
			System.out.println(text1);
			substring = substring.concat(text1);
		}
		
			System.out.println(substring);

	}

}


/**
 * Return the string (backwards) that is between the first and last appearance
 * of "bread" in the given string, or return the empty string "" if there is not
 * 2 occurances of "bread". Ignore Case<br>
 * <br>
 * For Example: sandwichFilling("breadclivebread") → "evilc"<br>
 * sandwichFilling("xxbreadfridgebreadyy") → "egdirf"<br>
 * sandwichFilling("xxBreadfridgeBReAdyy") → "egdirf"<br>
 * sandwichFilling("xxbreadyy") → "" sandwichFilling("xxbreADyy") → ""<br>
 * <br>
 * HINT: "a" == "a" if false HINT: "a".equals("a") is true
 */