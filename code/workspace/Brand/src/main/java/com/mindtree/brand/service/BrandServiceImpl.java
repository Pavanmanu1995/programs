package com.mindtree.brand.service;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.brand.entity.Brand;
import com.mindtree.brand.repository.BrandRepo;

@Service
public class BrandServiceImpl implements BrandService {
	
	@Autowired
	private BrandRepo brandRepo;

	@Override
	public List<Brand> getAllBrand() {
		return brandRepo.findAll();
	}

	@Override
	public Brand addBrand(Brand brand) {
		return brandRepo.save(brand);
	}

}
