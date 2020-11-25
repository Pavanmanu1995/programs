package com.mindtree.candyshop.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Candy implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //identity is auto increment and primary 
	private int id;
	private String name;
	private double price;
	private int stock;
	
	@ManyToOne(fetch=FetchType.LAZY) //many candy are mapped to one shop fetch lazy=it vil not fetch data from the shop also
	@JsonIgnore //when we are returing the list in recussion
	private Shop shop;

	public Candy() {
		super();
	}

//	public Candy(String name, double price, int stock, Shop shop) {
//		super();
//		//this.id = id;
//		this.name = name;
//		this.price = price;
//		this.stock = stock;
//		this.shop = shop;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	
	
	

}
