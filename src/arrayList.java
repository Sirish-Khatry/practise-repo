import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<String> city = new ArrayList<>();
		
		city.add("Kathmandu");
		city.add("London");
		city.add("Las Vegas");
		
		System.out.println(city);
		
		for(int i = 0; i < city.size(); i++) { //Normal for loop
			System.out.println(city.get(i));
		}
		
		for(String str : city) { // Enhanced for-loop
			System.out.println(str);
		}
		
		System.out.println(city.get(0)); // Get specific element
		
		city.set(2, "New York"); // Set different element
		System.out.println(city.get(2)); 
		
		city.remove(1); // Remove specific element
		System.out.println(city); 
		
		List<Integer> nums = new ArrayList<>(); // Sort Using Integer arrayList
		nums.add(99);
		nums.add(11);
		nums.add(7);
		nums.add(1232030);
		
		Collections.sort(nums);
		
		   for (int i : nums) {
	            System.out.println(i);
	        }
		   
			List<String> words = new ArrayList<>(); // Sort Using String arrayList
			words.add("Zoo");
			words.add("X-Ray");
			words.add("Alpha");
			words.add("Cat");
			
			Collections.sort(words);
			
			   for (String i : words) {
		            System.out.println(i);
		        }
			
		
			   List<String> random = new ArrayList<>(); 
				random.add("Zoo");
				random.add("X-Ray");
				random.add("Alpha");
				random.add("Cat");
	            System.out.println("Original List: " + random);
	            Collections.reverse(random);                          // Reverse
	            System.out.println("Modified List: " + random);
	            Collections.swap(random, 0, 3);                      // Swap
	            System.out.println("Swapped List: " + random);
	            
		
	}

}

