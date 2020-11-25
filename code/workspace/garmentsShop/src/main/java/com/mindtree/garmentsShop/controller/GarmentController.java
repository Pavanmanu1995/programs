package com.mindtree.garmentsShop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.garmentsShop.entity.Brand;
import com.mindtree.garmentsShop.entity.Shop;
import com.mindtree.garmentsShop.service.BrandService;
import com.mindtree.garmentsShop.service.ShopService;

@RestController
public class GarmentController {
	
	@Autowired
	private BrandService brandService;
	
	@Autowired
	private ShopService shopService;
	
	@GetMapping("/our/choice")
	public String getChoice()
	{
		System.out.println("hello");
		return "welcome to springs";
	}
	
	@GetMapping("/get/shop")
	public List<Shop> getShopList()
	{
		List<Shop> shop=this.shopService.findAll();
		return shop;
	}
	
	@PostMapping("/add/data")
	public Shop addDataToShop(@RequestBody Shop shop)
	{
		return shopService.saveShop(shop);
	}
	
	@GetMapping("/get/brand")
	public List<Brand> getBrandList()
	{
		List<Brand> brand=this.brandService.findAll();
		return brand;
	}
	
	@GetMapping("/get/brand/byId/{id}")
	public Optional<Brand> getBrandsById(@PathVariable long id)
	{
		Optional<Brand> brand=this.brandService.fetchBrand(id);
		return brand;
	
	}
	
	@PostMapping("/add/brand")
	public Brand addDataToBrand(@RequestBody Brand brand)
	{
		return brandService.saveBrand(brand);
	}
	
//	@PutMapping("/update/{id}")
//	public Brands updateQuantity(@PathVariable("id") long brandId,@RequestParam int newQuantity)
//	{
//		return brandsService.updateQuantity(brandId,newQuantity);
//		
//	}
//	
//	@DeleteMapping("/delete/brand/by/id/{id}")
//	public String deleteBrand(@PathVariable long id)
//	{
//		brandsService.deleteBrand(id);
//		return "deleted successfully";
//		
//	}

}
