package hw10Abstraction;

public interface University extends College, Hospital {

	/*
	 * extends keyword used to inherit multiple interface clashes yes. 
	 * interface can inherit other interfaces and multiple inheritances possible 
	 * abstract and regular class can not be inherited by interface
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
