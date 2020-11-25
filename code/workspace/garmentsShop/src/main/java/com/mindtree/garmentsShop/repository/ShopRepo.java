package com.mindtree.garmentsShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.garmentsShop.entity.Shop;

@Repository
public interface ShopRepo extends JpaRepository<Shop, Long> {

}
