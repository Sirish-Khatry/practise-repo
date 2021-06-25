
public class string_manipulation {

	public static void main(String[] args) {
		
		String text1 = "yesterday it was raining";
		String text2 = "today it is sunny";
		//System.out.println(text2.toUpperCase()+ ", " + text1.toUpperCase());
		String text3 = text2 + ", " + text1;
		System.out.println(text3.toUpperCase());
		String text4 = "" + text3.substring(0,11);
		String text5 = "" + text3.substring(36,43);
		String text6 = text4 + " " + text5;
		System.out.println(text6.toUpperCase());
		

		System.out.println(stringCount("Hello World"));
		stringVertical("Hello World");
		stringReverse("Hello World");
		System.out.println(find("Hello World", "World"));

	}
	
	
	public static int stringCount(String text) {
		
		int count = 0;
		
		count = text.length();
		
		return count;
	}
	
	public static void stringVertical(String text) {
		
		
		for(int i=0; i < text.length(); i++) {
			System.out.println(text.substring(i, i+1)); 
		}

	}
	
	public static void stringReverse(String text) {
		
		
		for(int i = text.length(); i > 0; i--) {
			System.out.println(text.substring(i-1, i)); 
		}

	}
	
	public static Boolean find(String text, String text2) {
		
		Boolean check = false;
		
		check = text.contains(text2);

		return check;

	}
	
	
	

}
