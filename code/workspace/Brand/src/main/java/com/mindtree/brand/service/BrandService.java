package com.mindtree.brand.service;

import org.hibernate.mapping.List;

import com.mindtree.brand.entity.Brand;

public interface BrandService {

	List<Brand> getAllBrand();

	 String addBrand(Brand brand);

	

}
