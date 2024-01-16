package hw06Methods;

public class FullName {
	
	public String fullName(String fName, String lName) {
		
		String firstAndLastName = fName + lName;
		
		System.out.println("Family Member: " +fName + lName);
		return firstAndLastName;
	}
	
	public static void main (String[]args) {
		FullName fullName= new FullName();
		fullName.fullName("Rakib", " Khan");
		fullName.fullName("A", " Khan");
		fullName.fullName("B", " Khan");
		fullName.fullName("C", " Khan");
		fullName.fullName("D", " Khan");
		fullName.fullName("E", " Khan");
	}
	
	
	
	
	

}
