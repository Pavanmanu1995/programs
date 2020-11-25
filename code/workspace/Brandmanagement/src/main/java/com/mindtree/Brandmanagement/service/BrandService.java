package com.mindtree.Brandmanagement.service;

import java.util.List;

import com.mindtree.Brandmanagement.entity.Brand;

public interface BrandService {

	Brand addDataToBrand(Brand brand);

	List<Brand> getBrandDetails();

	List<Brand> sortBrandBasedOnQuantity();

	Object updateCountIfLessThan(int brandId, int newquantity);


}
