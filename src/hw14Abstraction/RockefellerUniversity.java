package hw14Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {

	public void maths() {
		System.out.println("Regular class RockefellerUniversity");
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("Override method from AeronauticalSchool");
		
	}

	@Override
	public void mechanicalLab() {
		System.out.println("Override method from EngineeringSchool");
		
	}
}
