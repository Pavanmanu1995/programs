package com.mindtree.brands.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Brands {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long brandId;
	
	private String brandName;
	
	private int noOfProducts;

	public Brands() {
		super();
	}

	public Brands(String brandName, int noOfProducts) {
		super();
		this.brandName = brandName;
		this.noOfProducts = noOfProducts;
	}

	public long getBrandId() {
		return brandId;
	}

	public void setBrandId(long brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getNoOfProducts() {
		return noOfProducts;
	}

	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}

	@Override
	public String toString() {
		return "Brands [brandId=" + brandId + ", brandName=" + brandName + ", noOfProducts=" + noOfProducts + "]";
	}
	
	
	
	
	

}
