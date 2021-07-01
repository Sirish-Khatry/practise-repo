package classExercise;

import java.util.ArrayList;

import inheritance_polimorphism.Engineering;
import inheritance_polimorphism.Student;
import inheritance_polimorphism.User;

public class Runner {

	public static void main(String[] args) {
		
//		Person staff1 = new Person();
//		Person staff2 = new Person("Sirish", 23, "QA Consultant");
//		Person staff3 = new Person("John", 30, "QA Team-Lead");
//		Person staff4 = new Person("Joe", 25, "QA Lecturer");
//		
//		staff1.printDetails();
//		staff2.printDetails();
//		
//		ArrayList<Person> staffList = new ArrayList<Person>();
//		
//		staffList.add(staff2);
//		staffList.add(staff3);
//		staffList.add(staff4);
//	
//		for(Person p : staffList) {
//			p.printDetails();
//		}
		
		User u = new User();
		u.greet();
		
		Student s = new Student();
		s.setUsername("Sirish");
		System.out.println(s.getUsername());
		
		Student engStudent = new Engineering();
		engStudent.studentGreet();
		
		
		String text = "xxbreadkcjrbreadxx";
		for(int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			String text2 = "" + Character.toString(c) + Character.toString(c) + Character.toString(c);
			text = text.concat(text2);
		}
		
		System.out.println(text);
		
		
	}
	
	

}
