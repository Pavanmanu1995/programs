package com.mindtree.employeeanddepartment.entity;

public class Employee {
	private int empId;
	private String empName;
	private int depId;
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, int depId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.depId = depId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", depId=" + depId + "]";
	}
	

}
