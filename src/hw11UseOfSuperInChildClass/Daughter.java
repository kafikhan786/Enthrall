package hw11UseOfSuperInChildClass;

public class Daughter extends Father {

	public String birthMonth;
	public int age;

	public Daughter() {
		// Super method can be called once either for default constructor or
		// parameterized constructor
		super();

		// father and father info method from Father class called by super keyword
		super.father();
		super.fatherInfo("Rahman", 100, 'M', true);

		// a variable from father class called by super keyword and implemented it.
		super.familyName = "Khan";

		System.out.println("Family Name: " + familyName);

		System.out.println("Default Constructor from Daughter class");
	}

	public Daughter(String birthMonth, int age) {
		// Parameterized constructor called by super method
		super("Rakib", 20, 'M', true);
		this.birthMonth = birthMonth;
		this.age = age;

		System.out.println("\nDaughter Birth Month: " + birthMonth + "\nDaughter Age: " + age);
	}

	public void daughter() {
		super.familyName = "Syed";
		System.out.println("daughter() inside Daughter class");
		System.out.println("Family Name in daughter method is: " + familyName);
	}

	public void daughterInfo(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;

		System.out.println("\nDaughter Birth Month: " + birthMonth + "\nDaughter Age: " + age);
	}
}
