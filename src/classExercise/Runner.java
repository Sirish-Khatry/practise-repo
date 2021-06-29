package classExercise;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		
		Person staff1 = new Person();
		Person staff2 = new Person("Sirish", 23, "QA Consultant");
		Person staff3 = new Person("John", 30, "QA Team-Lead");
		Person staff4 = new Person("Joe", 25, "QA Lecturer");
		
//		staff1.printDetails();
//		staff2.printDetails();
		
		ArrayList<Person> staffList = new ArrayList<Person>();
		
		staffList.add(staff2);
		staffList.add(staff3);
		staffList.add(staff4);
	
		for(Person p : staffList) {
			p.printDetails();
		}
	}
	
	

}
