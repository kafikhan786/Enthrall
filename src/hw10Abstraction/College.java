package hw10Abstraction;

public interface College {

	public void commonRoom();

	public void laboratory();

	public void languageClub();

	// default method
	public default void dorm() {

	}

	// static method
	public static void studyRoom() {

	}
}
