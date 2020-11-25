package com.mindtree.brands.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.brands.entity.Brands;
 @Repository
public interface BrandsRepo extends JpaRepository<Brands,Long> {

}
