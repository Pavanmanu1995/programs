package com.mindtree.brand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.brand.entity.Brand;
import com.mindtree.brand.service.BrandService;

import antlr.collections.List;

@RestController
public class Controller {
	
	@Autowired
	private BrandService service;
	
	@GetMapping("/our/choice")
	public String getChoice()
	{
		System.out.println("hellooooo");
		return "welcome to springs";
	}
	
	@RequestMapping("/get/brand")
	public List<Brand> getBrand()
	{
		return service.getAllBrand();
	}
		
	@PostMapping("/save/brand")
	public String addBrand(@RequestBody Brand brand)
	{
		return service.addBrand(brand);
	}
	
	
	
	

}
