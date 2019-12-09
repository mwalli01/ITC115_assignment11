package assignments;

public class EmployeeClient {

	public static void main(String[] args) {
		Janitor bob = new Janitor();
		System.out.println(bob.getVacationDays());
		System.out.println(bob.getSalary());
		System.out.println(bob.getHours());
		bob.clean();
	}

}
