package classExercise;

public class Person {
	
	private String name;
	private int age;
	private String jobtitle;
	
	public Person(String name, int age, String jobtitle) {
		this.name = name;
		this.age = age;
		this.jobtitle = jobtitle;
	}
	
	public Person() {
		
	}
	
	public void printDetails() {		
		System.out.println("Name: " + this.name + ", Age: " + this.age + ", Job-Title: " + this.jobtitle);
	}

}
