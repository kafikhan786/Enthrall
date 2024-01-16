package hw09Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

		// Object created
		Employee employee = new Employee();

		// set value of all private variables
		employee.setName("Kafi");
		employee.setAge(33);
		employee.setSex('M');
		employee.setCitizen(true);

		// print all set value by get method
		System.out.println("Employee Name: " + employee.getName() + "\nEmployee Age: " + employee.getAge()
				+ "\nEmploye Sex: " + employee.getSex() + "\nIs Employee US Citizen: " + employee.isCitizen());

	}

}