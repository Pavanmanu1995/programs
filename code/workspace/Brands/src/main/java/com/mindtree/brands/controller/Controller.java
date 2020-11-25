package com.mindtree.brands.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.brands.entity.Brands;
import com.mindtree.brands.service.IBrandsService;

@RestController
public class Controller {
	
	@Autowired
	private IBrandsService brandsService;
	
	@GetMapping("/our/choice")
	public String getChoice()
	{
		System.out.println("hello");
		return "welcome to string";
	}
	
	@GetMapping("/get/brand")
	public List<Brands> getBrands()
	{
		return brandsService.getBrands();
	}
	
	@PostMapping("/add/data")
	public Brands addData(@RequestBody Brands brands)
	{
		return brandsService.addData(brands);
	}
	
	@GetMapping("/get/brand/byId/{id}")
	public Optional<Brands> getBrandsById(@PathVariable long id)
	{
		return brandsService.getBrandsById(id);
	
	}
	
	@PutMapping("/update/{id}")
	public Brands updateQuantity(@PathVariable("id") long brandId,@RequestParam int newQuantity)
	{
		return brandsService.updateQuantity(brandId,newQuantity);
		
	}
	
	@DeleteMapping("/delete/brand/by/id/{id}")
	public String deleteBrand(@PathVariable long id)
	{
		brandsService.deleteBrand(id);
		return "deleted successfully";
		
	}
	
	

}
