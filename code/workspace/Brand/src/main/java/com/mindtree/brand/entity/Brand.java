package com.mindtree.brand.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Brand {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long brandId;
	private String brandName;
	private int noOfProducts;
	
	public Brand() {
		super();
	}

	public Brand(String brandName, int noOfProducts) {
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
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + ", noOfProducts=" + noOfProducts + "]";
	}

	
}
