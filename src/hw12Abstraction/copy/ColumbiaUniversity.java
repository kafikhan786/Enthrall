package hw12Abstraction.copy;

public class ColumbiaUniversity extends MedicalSchool implements University {

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

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}
}
