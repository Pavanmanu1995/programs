package com.mindtree.Brandmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mindtree.Brandmanagement.entity.Shop;
import com.mindtree.Brandmanagement.service.ShopService;

public class ShopController {
	@Autowired
	private ShopService shopService;
	
	@GetMapping("/get/shop/details")
	public List<Shop> getShopDetails()
	{
		List<Shop> shop=new ArrayList<Shop>();
		shop=this.shopService.getShopDetails();
		return shop;
	}
	
	@PostMapping("/add/data/to/shop")
	public Shop addBrandToShop(Shop shop)
	{
		Shop shop1=null;
		shop1=this.shopService.addBrandToShop(shop);
		return shop1;
	}
	
	@GetMapping("/more/than/3")
	public List<Shop> getShopDetailsMoreThan()
	{
		List<Shop> shop=new ArrayList<Shop>();
		shop=this.shopService.getShopDetailsMoreThan(3);
		return shop;
	}
	
	

}
