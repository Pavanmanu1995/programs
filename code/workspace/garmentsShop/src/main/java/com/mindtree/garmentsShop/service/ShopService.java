package com.mindtree.garmentsShop.service;

import java.util.List;

import com.mindtree.garmentsShop.entity.Shop;

public interface ShopService {

	List<Shop> findAll();

	Shop saveShop(Shop shop);

}
