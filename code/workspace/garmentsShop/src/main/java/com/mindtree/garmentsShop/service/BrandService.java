package com.mindtree.garmentsShop.service;

import java.util.List;
import java.util.Optional;

import com.mindtree.garmentsShop.entity.Brand;

public interface BrandService {

	List<Brand> findAll();

	Optional<Brand> fetchBrand(long id);

	Brand saveBrand(Brand brand);

}
