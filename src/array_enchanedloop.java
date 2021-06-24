
public class array_enchanedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
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

}
