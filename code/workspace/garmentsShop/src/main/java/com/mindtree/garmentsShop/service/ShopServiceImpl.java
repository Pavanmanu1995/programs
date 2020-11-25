package com.mindtree.garmentsShop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.garmentsShop.entity.Shop;
import com.mindtree.garmentsShop.repository.ShopRepo;

@Service
public class ShopServiceImpl implements ShopService {
	
	@Autowired
	private ShopRepo shopRepo;

	@Override
	public List<Shop> findAll() {
		List<Shop> shop=this.shopRepo.findAll();
		return shop;
	}

	@Override
	public Shop saveShop(Shop shop) {
		Shop saveShop=this.shopRepo.save(shop);
		return saveShop;
	}

}
