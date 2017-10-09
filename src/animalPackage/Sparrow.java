package animalPackage;

public class Sparrow extends Bird implements Flyable{

	public Sparrow(int age, String gender, int weightInKilos) {
		super(age, gender, weightInKilos);
	}

	public void fly() {
		System.out.println("Sparrow Flying High");
	}

}
