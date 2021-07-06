package generics;

public class Dog extends Animal {
	
	private String breed;
	
	public Dog(String name, int age, String description, String breed) {
		super(name, age, description);
		this.breed = breed;
	}

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}




}
