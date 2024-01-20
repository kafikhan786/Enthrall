package hw13Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("Test Family Class");

		//object of sister class
		Sister sister = new Sister();
		sister.sister();
		sister.sister(5, 5);
		sister.sister(10, "10");
		sister.sister(5, 5, 5);
		sister.sister(5, 5, 5, 5);
		Sister.sister(5, 5, 5, 5, 5, 5); // Static method has to be called with direct class name

		// object of Niece class
		Niece niece = new Niece();
		niece.sister();
		niece.sister(5, 5);
		niece.sister(10, "10");
		niece.sister(5, 5, 5);

		// final and static method cannot be called because it was not override in child class
		// final and static method can't be override

	}

}
