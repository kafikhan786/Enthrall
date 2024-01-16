package hw10Abstraction;

public class ColumbiaUniversity extends MedicalSchool {

	// Regular class can inherit abstract class
	// Regular class can inherit another regular class
	// abstract method not allowed here because its a regular class
	// one keyword "extends" use to inherit regular class
	// only one inheritance possible with regular class and abstract class
	
	
	
	// public abstract void chemistry();
	public void biology() {
		System.out.println("Regular class ColumbiaUniversity");
	}

	// Default constructor
	public ColumbiaUniversity() {

	}
}
