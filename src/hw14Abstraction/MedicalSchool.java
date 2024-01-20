package hw14Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	
	//abstract class can inherit other abstract class by extends keyword
	// abstract class can also inherit multiple interface by implements keyword
    // abstract class can extends regular class
	
	
	
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
