package hw10Abstraction;

public abstract class MedicalSchool {

	// Abstract method with body not allowable
	public abstract void anatomyLab();

	// non abstract method with body
	public void biochemistryLab() {
		System.out.println("I am coming from abstract class non abstract method");
	}

	// default constructor
	public MedicalSchool() {

	}
}
