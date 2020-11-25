package com.mindtree.brands.service;

import java.util.List;
import java.util.Optional;

import com.mindtree.brands.entity.Brands;

public interface IBrandsService {

	List<Brands> getBrands();

	Brands addData(Brands brands);

	Optional<Brands> getBrandsById(long id);

	Brands updateQuantity(long brandId,int newQuantity);

	Object deleteBrand(long id);

}
