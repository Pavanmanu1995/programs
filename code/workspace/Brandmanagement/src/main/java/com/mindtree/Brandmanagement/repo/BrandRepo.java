package com.mindtree.Brandmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.Brandmanagement.entity.Brand;

public interface BrandRepo extends JpaRepository<Brand, Integer> {

}
