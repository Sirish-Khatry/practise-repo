
public class array_enchanedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//arrayExercise();
		//forLoops();
		//System.out.println(check(3));
		
	}
	
	public static void arrayExercise() {
		
		int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] num2 = new int[11];
		
		for(int i=0; i<num.length; i++) { //Iterating through the array
			System.out.println(num[i]);
		}
		
		
		for(int i=1; i<11; i++) {   //Assiging values to the array
			num2[i] = i;
			System.out.println(num2[i]);
		}
		
		for(int i=0; i<num2.length; i++) { //Multiplying the values by 10
			num2[i] = i * 10;
			System.out.println(num2[i]);
		}
		
	}
	
	
	public static void forLoops() {
		
		String stringArray[] = { "Nepal", "UK", "Dubai", "America"};
		
		for(String str : stringArray) {
			System.out.println(str);
		}
		
		int intArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		
		for(int num : intArray) {
			System.out.println(num*num);
		}
		
	}
	
	
	public static boolean check(int num) {
		
		boolean check = false;
		
		if((num % 2) == 0) {
			return check = true;
		}
		else {
			return check;
		}
		
	}

}
