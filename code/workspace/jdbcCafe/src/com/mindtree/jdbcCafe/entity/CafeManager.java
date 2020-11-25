package com.mindtree.jdbcCafe.entity;

public class CafeManager {
	private int managerId;
	private String managername;
	private double managerSalary;
	public CafeManager() {
		super();
	}
	public CafeManager(int managerId, String managername, double managerSalary) {
		super();
		this.managerId = managerId;
		this.managername = managername;
		this.managerSalary = managerSalary;
	}
	
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getManagername() {
		return managername;
	}
	public void setManagername(String managername) {
		this.managername = managername;
	}
	public double getManagerSalary() {
		return managerSalary;
	}
	public void setManagerSalary(double managerSalary) {
		this.managerSalary = managerSalary;
	}
	@Override
	public String toString() {
		return "CafeManager [managerId=" + managerId + ", managername=" + managername + ", managerSalary="
				+ managerSalary + "]";
	}
	
	

}
