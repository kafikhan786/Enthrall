package hw5Q2Constructor;

public class Student {

	// Variables declared
	public String stdntName;
	public int stdntID;
	public char stdntSex;
	public boolean isProgrammer;
	public float stdntGrade;

	// default constructor
	public Student() {
		System.out.println("Students Details Information");
	}

	// Parameterized constructor

	public Student(String stdntName, int stdntID, char stdntSex, boolean isProgrammer, float stdntGrade) {

		this.stdntName = stdntName;
		this.stdntID = stdntID;
		this.stdntSex = stdntSex;
		this.isProgrammer = isProgrammer;
		this.stdntGrade = stdntGrade;

		System.out.println("Student Name: " + stdntName + "\nStudent ID: " + stdntID + "\nStudent Sex: " + stdntSex
				+ "\nStudent Grade: " + stdntGrade + "\nIs he Java Programmer: " + isProgrammer);

	}

}
