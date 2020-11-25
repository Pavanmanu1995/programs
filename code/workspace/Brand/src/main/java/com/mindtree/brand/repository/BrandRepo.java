package com.mindtree.brand.repository;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.brand.entity.Brand;

@Repository
public interface BrandRepo extends JpaRepository<Brand, Integer> {
	
}

