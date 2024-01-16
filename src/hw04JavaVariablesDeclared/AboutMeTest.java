package hw04JavaVariablesDeclared;

public class AboutMeTest {

	public static void main(String[] args) {

		// Created an Object
		AboutMe aboutMe = new AboutMe();

		// Method initialized
//		aboutMe.cusVip = "Rakib";
//		aboutMe.nameOfCus();
		
		// Method initialized
		// variable initialized
		aboutMe.customerName = "Rakib";
		aboutMe.cusAge = 30;
		aboutMe.CusGender = 'M';
		aboutMe.cusHeight = 5.10f;
		aboutMe.cusCard = 1123;
		aboutMe.cusPhone = 12346667;
		aboutMe.cusRewards = 987654;
		aboutMe.cusMembership = true;

		aboutMe.nameOfClient();

	}

}
