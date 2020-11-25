package com.example.employee.dto;

import javax.validation.constraints.NotBlank;

public class EmployeeDTO {
	
	private int employeeId;

	@NotBlank(message = "Employee Name Cannot Be Empty")
	private String employeeName;
	
	private int employeeAge;
	
	private String competency;

	private double salary;
	
	//private Enum<Field> field;

	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(int employeeId, @NotBlank(message = "Employee Name Cannot Be Empty") String employeeName,
			int employeeAge, String competency, double salary, Enum<Field> field) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.competency = competency;
		this.salary = salary;
		//this.field = field;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public String getCompetency() {
		return competency;
	}

	public void setCompetency(String competency) {
		this.competency = competency;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

//	public Enum<Field> getField() {
//		return field;
//	}
//
//	public void setField(Enum<Field> field) {
//		this.field = field;
//	}
	
	



	

}

	