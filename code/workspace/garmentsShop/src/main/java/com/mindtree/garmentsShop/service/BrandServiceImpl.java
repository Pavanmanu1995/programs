package com.mindtree.garmentsShop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.garmentsShop.entity.Brand;
import com.mindtree.garmentsShop.repository.BrandRepo;
import com.mindtree.garmentsShop.repository.ShopRepo;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandRepo brandRepo;
	
	@Override
	public List<Brand> findAll() {
		List<Brand> brand=this.brandRepo.findAll();
		return brand;
	}

	@Override
	public Optional<Brand> fetchBrand(long id) {
		Optional<Brand> brand=this.brandRepo.findById(id);
		return brand;
	}

	@Override
	public Brand saveBrand(Brand brand) {
		return brandRepo.save(brand);
	}

}
