package client;

import java.util.List;
import java.util.Scanner;

import entity.Employee;
import exception.EmployeeDaoException;
import exception.EmployeeServiceException;
import service.EmployeeService;

public class EmployeeApp {

	static Scanner sc = new Scanner(System.in);
	// Create servile layer object which will be used to call service methods
	static EmployeeService es = new EmployeeService();

	public static void main(String[] args) {
		do {
			displayMenu();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Employee emp = createEmployee();
				try {
					es.insertEmployee(emp);
				} catch (EmployeeServiceException e) {
					e.printStackTrace();
				}

				break;
			case 2:
				// Call method from service layer which gives all employees
				List<Employee> Employee = es.getAllEmployees();
				// Employee.forEach(System.out::println);

				// traverse through list of employees and print details
				displayEmployees(Employee);

				break;
			case 3:
				System.exit(0);
				break;

			}
		} while (true);

	}

	public static void displayEmployees(List<Employee> Employee) {
		for (Employee employee : Employee) {
			System.out.println("====================================");
			System.out.println("Employee ID : " + employee.getId());
			System.out.println("Employee Name : " + employee.getName());
			System.out.println("Employee Email : " + employee.getEmail());
			System.out.println("Employee Country : " + employee.getCountry());
			System.out.println("====================================");
		}
	}

	public static Employee createEmployee() {
		// Get all user input
		System.out.println("Enter Employee ID");
		int id = sc.nextInt();
		System.out.println("Enter Employee Name");
		String name = sc.next();
		System.out.println("Enter Employee emil");
		String email = sc.next();
		System.out.println("Enter Employee Country");
		String country = sc.next();
		// Create Employee object
		Employee emp = new Employee(id, name, email, country);
		// Pass that object to service layer
		return emp;
	}

	public static void displayMenu() {
		System.out.println("1.Enter Employee Details");
		System.out.println("2.To print All Employee details");
		System.out.println("3.To Exit ");
		System.out.println("Enter your choice:");
	}

}
