package hw13Polymorphism;

/* Method overloading is when multiple method have same name with different type and/ or parameter 
* Method overloading also call compile time Polymorphism 
*
*/
public class Sister {

	public void sister() {
		System.out.println("Void type non-parameterized method");
	}

	public void sister(int age1, int age2) {
		int total = age1 + age2;

		System.out.println("Return type parameterized method 1: Total: " + total);

	}

	public int sister(int age3, String age4) {

		int total2 = age3 + Integer.parseInt(age4);
		System.out.println("Return type parameterized method 2: Total: " + total2);
		return total2;
	}

	public int sister(int age4, int age5, int age6) {

		int total3 = age4 + age5 + age6;
		System.out.println("Return type parameterized method 3: Total: " + total3);

		return total3;
	}

	public final int sister(int age1, int age2, int age3, int age4) {

		int total4 = age1 + age2 + age3 + age4;
		System.out.println("Return type Final type parameterized method 4: Total: " + total4);

		return total4;
	}

	public static void sister(int age1, int age2, int age3, int age4, int age5, int age6) {
		int total5 = age1 + age2 + age3 + age4 + age5 + age6;
		System.out.println("Void type Static parameterized method 5: Total: " + total5);

	}

}
