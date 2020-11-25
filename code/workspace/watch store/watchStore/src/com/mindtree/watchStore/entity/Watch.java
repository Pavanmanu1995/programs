package com.mindtree.watchStore.entity;

public class Watch {
	private int watchId;
	private int typeId;
	private String modelNumber;
	private double price;
	public Watch() {
		super();
	}
	public Watch(int watchId, int typeId, String modelNumber, double price) {
		super();
		this.watchId = watchId;
		this.typeId = typeId;
		this.modelNumber = modelNumber;
		this.price = price;
	}
	public int getWatchId() {
		return watchId;
	}
	public void setWatchId(int watchId) {
		this.watchId = watchId;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Watch [watchId=" + watchId + ", typeId=" + typeId + ", modelNumber=" + modelNumber + ", price=" + price
				+ "]";
	}
	
}
