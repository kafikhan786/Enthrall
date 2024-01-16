package hw05Q2Constructor;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student= new Student();
		
		Student stdntOneInfo = new Student("Alex", 1234, 'M', true, 3.56f );
		
		Student stdntTwoInfo = new Student("Adam", 4567, 'M', true, 4.20f );
		
		Student stdntThreeInfo = new Student("Sabrina", 47895, 'F', false, 1.56f );
	}

}
