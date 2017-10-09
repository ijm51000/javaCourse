package animalPackage;

public class Zoo {

	public static void main(String[] args) {
		Animal spuggy1 = new Sparrow(2, "m", 1);
		spuggy1.move();
		spuggy1.eat();
		
		Animal fish1 = new Fish(2, "f", 2);
		fish1.move();
		moveAnimal(fish1);
		moveAnimal(spuggy1);
		Flyable flyingBird = new Sparrow(1, "m", 1);
		flyingBird.fly();
		// but this does not work as Bird does not implement flyable
		// type mismatch
		//Flyable flyingBird2 = new Bird(1,"F", 1);
	
	}
	public static void moveAnimal(Animal animal) {
		animal.move();
		
	
	}
}
