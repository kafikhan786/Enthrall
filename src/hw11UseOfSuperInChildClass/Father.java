package hw11UseOfSuperInChildClass;

public class Father {

	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("Default constructor from Father class");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {

		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println("\nName: " + name + "\nAge: " + age + "\nSex: " + sex + "\nUS Citizen: " + usCitizen);
	}

	public void father() {
		System.out.println("father() inside Father class");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {

		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println("\nName: " + name + "\nAge: " + age + "\nSex: " + sex + "\nUS Citizen: " + usCitizen);
	}

}
