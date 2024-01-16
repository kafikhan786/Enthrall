package hw03JavaVariables;

public class AboutMe {

	public String customerDetail; // Variable declared

	public String customerName = "Adam";

	public byte cusAge = 110; // byte runs between -128 to 127
	public short cusCard = 1234;
	public int cusPhone = 646549212;
	public long cusAccNumber = 123456789l; // use l at the end

	public float cusHeight = 5.5f; // use f at the end
	public double cusRewards = 223.5647;

	public char CusGender = 'M';
	public boolean cusMembership = true;

	// Constructor declared

	public AboutMe() {
		System.out.println("Customer Information: ");
	}

	
	/*
	 * public static void main(String[] args) { 
	 * AboutMe aboutMe = new AboutMe();
	 * System.out.println(aboutMe.customerName);
	 * System.out.println(aboutMe.cusCard); System.out.println(aboutMe.cusPhone);
	 * System.out.println(aboutMe.cusAccNumber);
	 * System.out.println(aboutMe.cusHeight);
	 * System.out.println(aboutMe.cusRewards);
	 * System.out.println(aboutMe.CusGender);
	 * System.out.println(aboutMe.cusMembership);
	 * 
	 * }
	 */
	 

}
