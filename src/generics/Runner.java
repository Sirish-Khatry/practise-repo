package generics;

public class Runner {

	public static void main(String[] args) {
		
		Dog myDog = new Dog("Mikel", 2, "SK", "Breed");
		Cat myCat = new Cat("Totur", 1, "MB");
		
		Cage<Animal> myCage = new Cage<>();
		
//		System.out.println(myDog.getName());
		myCage.add(myDog);
		System.out.println(myCage.get());
//		myCage.animalDetails();

	}

}
