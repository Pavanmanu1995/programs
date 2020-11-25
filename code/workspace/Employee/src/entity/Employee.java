package entity;

public class Employee extends Person {
	
	private int employeeId;
	private String employeeDesignation;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(int employeeId, String employeeDesignation, double salary, int personID,String personName, long mobNuber) {
		super(personID, personName, mobNuber);
		this.employeeId = employeeId;
		this.employeeDesignation = employeeDesignation;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
	

}
