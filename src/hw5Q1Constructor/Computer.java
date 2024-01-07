package hw5Q1Constructor;

public class Computer {

	public String brand;
	public String model;;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public Computer() {
		System.out.println("My Laptop Details Information");
	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {

		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;

		System.out.println("Laptop Brand: " + brand + "\nModel: " + model + "\nOperating System: " + operatingSystem
				+ "\nPrice: " + "$" + price + "\nGrade: " + grade + "\nMade in USA? " + madeInUSA);

	}
	

}
