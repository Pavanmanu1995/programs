package com.mindtree.garmentsShop.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="shop")
public class Shop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long shop_Id;
	private String name;
	
	@OneToMany(mappedBy="shop", cascade=CascadeType.ALL)
	private  Set<Brand> brands;
	
	public Set<Brand> getBrands()
	{
		return brands;
	}
	
	public void setBrands(Set<Brand> brands)
	{
		this.brands=brands;
	}

	public Shop() {
		super();
	}
	
	public Shop(String string)
	{
		this.name=string;
	}

	
	public Shop(String name, Set<Brand> brands) {
		super();
		this.name = name;
		this.brands = brands;
	}

	public long getShop_Id() {
		return shop_Id;
	}

	public void setShop_Id(long shop_Id) {
		this.shop_Id = shop_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Shop [shop_Id=" + shop_Id + ", name=" + name + ", brands=" + brands + "]";
	}

	
	
}
