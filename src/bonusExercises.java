import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bonusExercises {

	public static void main(String[] args) {
		
		//System.out.println(primeChecker(2));
		// TODO Auto-generated method stub
		
		System.out.println(commonDivisor(90,30));

	}
	
	
	public static Boolean primeChecker(int num) {
	
		if(num <= 1) {
			return false;
		}
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static String commonDivisor(int num1, int num2) {
		String msg = "";
		int num = 0;
		int max = 0;
		boolean contains = false;
		List<Integer> nums1 = new ArrayList<>();
		List<Integer> nums2 = new ArrayList<>();
		
		for(int i = 1; i < num1; i++) {
			if(num1 % i == 0) {
			nums1.add(num1/i);
			}
		}
		
		for(int i = 2; i < num2; i++) {
			if(num2 % i == 0) {
			nums2.add(num2/i);
			}
		}
		
		System.out.println(nums1);
		System.out.println(nums2);
		
		
		int sizenums1 = nums1.size();
		int sizenums2 = nums2.size();
		
		if(sizenums1 <= sizenums2) {
			max = Collections.max(nums1);
			contains = nums2.contains(max);
		}
		
		else if (sizenums2 < sizenums1) {
			max = Collections.max(nums2);
			contains = nums1.contains(max);
		}
		
		
		if(contains == true) {
			msg = "Highest Common Divisor: " + max;
			return msg;
		}
		
		else {
			msg = "No common Divisor";
			return msg;
		}	
		
	}

}
