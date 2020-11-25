package com.mindtree.appliance.entity;

public class Appliance implements Comparable<Appliance> {

	private int applianceId;
	private String applianceName;
	private int appliancePrice;

	public Appliance(int applianceId, String applianceName, int appliancePrice) {
		super();
		this.applianceId = applianceId;
		this.applianceName = applianceName;
		this.appliancePrice = appliancePrice;
	}

	public Appliance() {
		super();
	}

	public int getApplianceId() {
		return applianceId;
	}

	public void setApplianceId(int applianceId) {
		this.applianceId = applianceId;
	}

	public String getApplianceName() {
		return applianceName;
	}

	public void setApplianceName(String applianceName) {
		this.applianceName = applianceName;
	}

	public float getAppliancePrice() {
		return appliancePrice;
	}

	public void setAppliancePrice(int appliancePrice) {
		this.appliancePrice = appliancePrice;
	}

	public int compareTo(Appliance o) {
		return this.appliancePrice - o.appliancePrice;
	}

}
