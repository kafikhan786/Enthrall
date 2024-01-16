package hw08Abstraction;

public abstract class MedicalSchool {

	// abstruct method with body not allowable
	public abstract void anatomyLab();

	// non abstruct method with body
	public void biochemistryLab() {
		System.out.println("I am coming from abstruct class non abstruct method");
	}

	// default constructor
	public MedicalSchool() {

	}
}
