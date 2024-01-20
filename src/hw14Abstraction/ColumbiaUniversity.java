package hw14Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	// Regular class can inherit abstract class
	// Regular class can inherit another regular class
	// abstract method not allowed here because its a regular class
	// one keyword "extends" use to inherit regular class
	// only one inheritance possible with regular class and abstract class
	// multiple inheritance possible for interface by implements keyword in regular
	// class
	// abstract class or interface when inherited to regular class, it has to be
	// implemented the body of the method of those classes.

	// public abstract void chemistry();
	public void biology() {
		System.out.println("Regular class ColumbiaUniversity");
	}

	// Default constructor
	public ColumbiaUniversity() {
		System.out.println("Default constructor from colombia university");
	}

	@Override
	public void anatomyLab() {
		System.out.println("Override method from Medical school");

	}

	@Override
	public void classSize() {
		System.out.println("Override method from University");

	}

	@Override
	public void playGround() {
		System.out.println("Override method from University");

	}

	@Override
	public void teacher() {
		System.out.println("Override method from University");

	}

	@Override
	public void vocationalInfo() {
		System.out.println("Override method from Vocational School");

	}

	@Override
	public void commonRoom() {
		System.out.println("Override method from College");

	}

	@Override
	public void laboratory() {
		System.out.println("Override method from College");

	}

	@Override
	public void languageClub() {
		System.out.println("Override method from College");

	}

	@Override
	public void emergencyRoom() {
		System.out.println("Override method from Hospital");

	}

	@Override
	public void surgeryRoom() {
		System.out.println("Override method from Hospital");

	}

	@Override
	public void cafeteria() {
		System.out.println("Override method from Hospital");

	}

	@Override
	public void lawInfo() {
		System.out.println("Override method from Law school");

	}

	@Override
	public void hygiene() {
		System.out.println("Override method from Nursing school");

	}
}
