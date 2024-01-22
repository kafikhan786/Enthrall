package hw14Abstraction;

public class TestInstitute {

	public static void main(String[] args) {

		ColumbiaUniversity cu = new ColumbiaUniversity();

		// An Interface can not be instantiate
		// University university=new University(); 
		
		// An abstract class can not be instantiate. Can not call method directly but through child class.
		// MedicalSchool ms= new MedicalSchool(); 
		
		
		cu.biology();
		cu.anatomyLab();
		cu.classSize();
		cu.playGround();
		cu.teacher();
		cu.vocationalInfo();
		cu.commonRoom();
		cu.laboratory();
		cu.languageClub();
		cu.emergencyRoom();
		cu.surgeryRoom();
		cu.cafeteria();
		cu.lawInfo();
		cu.hygiene();
		cu.biochemistryLab();
		cu.maths();
		cu.aeronauticalInfo();
		cu.mechanicalLab();
		cu.caring();
		cu.anthropology();
		cu.gymnasium();
		cu.dorm();
		cu.morgue();
		
		

	}
}
