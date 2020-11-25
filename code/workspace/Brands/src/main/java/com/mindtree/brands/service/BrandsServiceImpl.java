package com.mindtree.brands.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.brands.entity.Brands;
import com.mindtree.brands.repository.BrandsRepo;

@Service
public class BrandsServiceImpl implements IBrandsService {

	@Autowired
	private BrandsRepo brandsRepo;

	@Override
	public List<Brands> getBrands() {
		// List<Brands> brands=new ArrayList<>();
		return brandsRepo.findAll();
//		for (Brands b : brands) {
//			System.out.println(b);	
//		}

	}

	@Override
	public Brands addData(Brands brands) {
		return brandsRepo.save(brands);
	}

	@Override
	public Optional<Brands> getBrandsById(long id) {
		return brandsRepo.findById(id);
	}

	@Override
	public Brands updateQuantity(long brandId, int newQuantity) {
		Brands brand = brandsRepo.getOne(brandId);
		brand.setNoOfProducts(newQuantity);
		return brandsRepo.save(brand);
	}

	@Override
	public Object deleteBrand(long id) {
		brandsRepo.deleteById(id);
		return id;

	}

}
