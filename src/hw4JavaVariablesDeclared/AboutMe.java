package hw4JavaVariablesDeclared;

public class AboutMe {

	public String customerDetail; // Variable declared

	public String customerName;

	public byte cusAge; // byte runs between -128 to 127
	public short cusCard;
	public int cusPhone;
	public long cusAccNumber; // use l at the end

	public float cusHeight; // use f at the end
	public double cusRewards;

	public char CusGender;
	public boolean cusMembership;

	// Constructor declared

	public AboutMe() {
		System.out.println("Customer Information: ");
	}

	// variable declared
	String cusName;
	String cusVip;

	// method implemented
	public void nameOfCus() {

		System.out.println("I am printing from Cus Method");
		System.out.println(cusName = "Mike");
		System.out.println(cusVip);

	}

	// method implemented
	public void nameOfClient() {
		System.out.println("Printing from Client Method");

		System.out.println("Customer Name: " + customerName);
		System.out.println("Customer Age: " + cusAge);
		System.out.println("Customer Card: " + cusCard);
		System.out.println("Customer Phone: " + cusPhone);
		System.out.println("Customer Account: " +cusAccNumber);
		System.out.println("Customer Height: " + cusHeight);
		System.out.println("Customer Reward: " + cusRewards);
		System.out.println("Customer Gender: " + CusGender);
		System.out.println("Customer Membership: " + cusMembership);

	}

}
