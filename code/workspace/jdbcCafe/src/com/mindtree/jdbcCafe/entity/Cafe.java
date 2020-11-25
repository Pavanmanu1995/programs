package com.mindtree.jdbcCafe.entity;

public class Cafe {
	private int cafeId;
	private String cafeName;
	private double CafeRevenue;
	private int managerId;
	public Cafe() {
		super();
	}
	public Cafe(int cafeId, String cafeName, double cafeRevenue, int managerId) {
		super();
		this.cafeId = cafeId;
		this.cafeName = cafeName;
		CafeRevenue = cafeRevenue;
		this.managerId = managerId;
	}
	public int getCafeId() {
		return cafeId;
	}
	public void setCafeId(int cafeId) {
		this.cafeId = cafeId;
	}
	public String getCafeName() {
		return cafeName;
	}
	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}
	public double getCafeRevenue() {
		return CafeRevenue;
	}
	public void setCafeRevenue(double cafeRevenue) {
		CafeRevenue = cafeRevenue;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	@Override
	public String toString() {
		return "Cafe [cafeId=" + cafeId + ", cafeName=" + cafeName + ", CafeRevenue=" + CafeRevenue + ", managerId="
				+ managerId + "]";
	}
	
	

}
