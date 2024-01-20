package hw13Polymorphism;

/* Method Overriding is when a same method initialize in child class with different implementation.  
* In easy way to remember is when child class has exact same method of parent class
* initialize with different value 
* when called override method we can change the arguments of the parameterized method
*
*/

public class Niece extends Sister {

	@Override
	public void sister() {
		System.out.println("\nVoid type non-parameterized override method in Niece class");
	}

	@Override
	public void sister(int age1, int age2) {
		int total = age1 + age2 + 100;

		System.out.println("Return type parameterized override method 1: Total: " + total);

	}

	@Override
	public int sister(int age3, String age4) {

		int total2 = age3 + Integer.parseInt(age4) + 100;
		System.out.println("Return type parameterized override method 2: Total: " + total2);
		return total2;
	}

	@Override
	public int sister(int age4, int age5, int age6) {

		int total3 = age4 + age5 + age6 + 100;
		System.out.println("Return type parameterized override method 3: Total: " + total3);

		return total3;
	}

	// Final method from parents class cannot be override
	// Static method can not be override.
	// if we don't write @override then static method think he's from same class Local class

}
