package generics;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		Dog myDog = new Dog("Mikel", 2, "SK", "Breed");
		Cat myCat = new Cat("Totur", 1, "MB");
		
		List<Cage<Animal>> myCage = new ArrayList<>();
		
//		System.out.println(myDog.getName());
		myCage.add(new Cage<>(myDog));
		
		for(Cage<Animal> animal : myCage) {
			System.out.println(animal.get());
		}
//		myCage.animalDetails();

	}

}
