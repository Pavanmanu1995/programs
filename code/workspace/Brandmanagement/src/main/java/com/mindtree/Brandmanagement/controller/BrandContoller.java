package com.mindtree.Brandmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.Brandmanagement.entity.Brand;
import com.mindtree.Brandmanagement.entity.Shop;
import com.mindtree.Brandmanagement.service.BrandService;
import com.mindtree.Brandmanagement.service.ShopService;

@RestController
public class BrandContoller {
	
	@Autowired
	private BrandService brandService;
	
	@PostMapping("/insert/data/to/brand")
	public Brand addDataToBrand(@RequestBody Brand brand)
	{
		Brand brand1=null;
		brand=this.brandService.addDataToBrand(brand);
				return brand;
	}
	
	@GetMapping("/get/brand/details")
	public List<Brand> getBrandDetails()
	{
		List<Brand> brand=new ArrayList<Brand>();
		brand=this.brandService.getBrandDetails();
		return brand;
	}
	
	@GetMapping("/sort")
	public List<Brand> sortBrandBasedOnQuantity()
	{
		List<Brand> brand=new ArrayList<Brand>();
		brand=this.brandService.sortBrandBasedOnQuantity();
		return brand;
	}
	
	@PutMapping("/update/{brandId}")
	public Object updateCount(@PathVariable("brandId") int brandId,@RequestParam int newquantity)
	{
		return brandService.updateCountIfLessThan(brandId,newquantity);
	}

}
