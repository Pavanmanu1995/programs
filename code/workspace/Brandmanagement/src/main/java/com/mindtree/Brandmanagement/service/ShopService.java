package com.mindtree.Brandmanagement.service;

import java.util.List;

import com.mindtree.Brandmanagement.entity.Shop;

public interface ShopService {

	List<Shop> getShopDetails();

	Shop addBrandToShop(Shop shop);

	List<Shop> getShopDetailsMoreThan(int i);


}
