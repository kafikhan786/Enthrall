package hw14Abstraction;

public interface University extends College, Hospital {

	/*
	 * extends keyword used to inherit multiple interface clashes yes. interface can
	 * inherit other interfaces and multiple inheritances possible abstract and
	 * regular class can not be inherited by interface
	 */

	/*
	 * one keyword use to inherit interface. interface can inherit other interfaces
	 * but can not abstract or regular class. interface can inherit multiple
	 * interfaces by extends keyword- regular or abstract class can extends one class
	 * but implement multiple classes
	 */
	public void classSize();

	public void playGround();

	public void teacher();

	// Can not create constructor in Interface
	// public University() {}

	// default method
	public default void gymnasium() {

	}

	// static method
	public static void library() {

	}

}
