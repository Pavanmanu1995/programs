package com.mindtree.Brandmanagement.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Shop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shopId;
	private String shopName;
	
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL,mappedBy="shop")
	List<Brand> brand=new ArrayList<Brand>();

	public Shop() {
		super();
	}

	public Shop(String shopName, List<Brand> brand) {
		super();
		this.shopName = shopName;
		this.brand = brand;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<Brand> getBrand() {
		return brand;
	}

	public void setBrand(List<Brand> brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopName=" + shopName + ", brand=" + brand + "]";
	}
	
	
	

}
