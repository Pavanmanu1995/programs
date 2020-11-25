package entity;

public class Employee extends Person {
	private int EmployeeID;
	private String department;
	private double salary;
	private String designation;
	public Employee() {
		super();
	}
	public Employee(int employeeID, String department, double salary, String designation, int personID, String personName, String address,long mobileNumber, long aadharNumber) {
		super(personID, personName, address,mobileNumber, aadharNumber);
		EmployeeID = employeeID;
		this.department = department;
		this.salary = salary;
		this.designation = designation;
	}
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
	
	
	

}
