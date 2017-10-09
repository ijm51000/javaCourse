package animalPackage;
//Abstract classes can only be inherited never instantiated 
public abstract class Animal {
	
	int age;
	String gender;
	int weightInKilos ;
	
	
	public Animal(int age, String gender, int weightInKilos) {
		this.age = age;
		this.gender = gender;
		this.weightInKilos = weightInKilos;
	
		
	}
	public void eat() {
		System.out.println("Eating...");
	
	}
	public void sleep() {
		System.out.println("Sleeping...");
	}
	public abstract void move();
}
