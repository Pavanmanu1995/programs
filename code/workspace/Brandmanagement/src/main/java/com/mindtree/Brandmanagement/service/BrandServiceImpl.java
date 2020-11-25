package com.mindtree.Brandmanagement.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mindtree.Brandmanagement.entity.Brand;
import com.mindtree.Brandmanagement.repo.BrandRepo;

public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandRepo brandRepo;

	@Override
	public Brand addDataToBrand(Brand brand) {
		Brand brand1 = null;
		brand1 = this.brandRepo.save(brand);
		return brand1;
	}

	@Override
	public List<Brand> getBrandDetails() {
		List<Brand> brand = new ArrayList<Brand>();
		brand = this.brandRepo.findAll();
		return brand;
	}

	@Override
	public List<Brand> sortBrandBasedOnQuantity() {
		List<Brand> brand = new ArrayList<Brand>();
		brand = this.brandRepo.findAll();
		Collections.sort(brand, new Comparator<Brand>() {

			@Override
			public int compare(Brand brand1, Brand brand2) {
				return brand1.getNumberOfCloths() - brand2.getNumberOfCloths();

			}

		});
		return brand;
	}

	@Override
	public Object updateCountIfLessThan(int brandId, int newquantity) {
		Brand brand=brandRepo.getOne(brandId);
		if(brand.getNumberOfCloths()<2)
			brand.setNumberOfCloths(newquantity);
		return brandRepo.save(brand);
	}

	
}
