package com.mindtree.employee.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class EmployeeDTO {
	
	private int id;

	@NotBlank(message = "Employee Name Cannot Be Empty")
	private String name;

	private double salary;

	private String mobileNumber;

	@NotBlank(message = "Employee Designation Cannot Be Empty")
	private String designation;


	public EmployeeDTO() {
		// TODO Auto-generated constructor stub
	}


	public EmployeeDTO(int id, @NotBlank(message = "Employee Name Cannot Be Empty") String name, double salary,
			String mobileNumber, @NotBlank(message = "Employee Designation Cannot Be Empty") String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.mobileNumber = mobileNumber;
		this.designation = designation;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}

}

	