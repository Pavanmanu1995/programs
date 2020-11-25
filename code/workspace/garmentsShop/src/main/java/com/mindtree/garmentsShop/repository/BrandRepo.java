package com.mindtree.garmentsShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.garmentsShop.entity.Brand;

@Repository
public interface BrandRepo extends JpaRepository<Brand, Long> {

}
