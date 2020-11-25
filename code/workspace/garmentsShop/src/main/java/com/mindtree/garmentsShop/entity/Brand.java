package com.mindtree.garmentsShop.entity;

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
	private long brand_Id;
	private String name;
	private int noOfProducts;
	
	@ManyToOne
	@JoinColumn(name="shop_Id")
	private Shop shop;

	public Brand() {
		super();
	}

	public Brand(String name, int noOfProducts, Shop shop) {
		super();
		//this.brand_Id = brand_Id;
		this.name = name;
		this.noOfProducts = noOfProducts;
		this.shop = shop;
	}

	public long getBrand_Id() {
		return brand_Id;
	}

	public void setBrand_Id(long brand_Id) {
		this.brand_Id = brand_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfProducts() {
		return noOfProducts;
	}

	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	@Override
	public String toString() {
		return "Brand [brand_Id=" + brand_Id + ", name=" + name + ", noOfProducts=" + noOfProducts + ", shop=" + shop
				+ "]";
	}

	
	
	
	

}
