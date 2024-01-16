package hw12Abstraction.copy;

public interface Hospital {

	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	// default method
	public default void morgue() {

	}

	// static method
	public static void pharmacy() {

	}
}
