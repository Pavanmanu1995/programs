package com.mindtree.Brandmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Brand {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int brandId;
	private String brandName;
	private int numberOfCloths;
	
	@ManyToOne
	@JoinColumn(name="shopId")
	private Shop shop;

	public Brand() {
		super();
	}

	public Brand(String brandName, int numberOfCloths, Shop shop) {
		super();
		this.brandName = brandName;
		this.numberOfCloths = numberOfCloths;
		this.shop = shop;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getNumberOfCloths() {
		return numberOfCloths;
	}

	public void setNumberOfCloths(int numberOfCloths) {
		this.numberOfCloths = numberOfCloths;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + ", numberOfCloths=" + numberOfCloths
				+ ", shop=" + shop + "]";
	}
	
	
	
	

}
