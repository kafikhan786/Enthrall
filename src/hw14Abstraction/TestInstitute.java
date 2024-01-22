package hw14Abstraction;

public class TestInstitute {

	public static void main(String[] args) {

		ColumbiaUniversity cu = new ColumbiaUniversity();
		University uni = new ColumbiaUniversity();
		MedicalSchool ms = new ColumbiaUniversity();
		

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

		uni.gymnasium();
		University.library(); // Static method, thats why its called by class name

		ms.biochemistryLab();
		ms.mechanicalLab();

	}
}
