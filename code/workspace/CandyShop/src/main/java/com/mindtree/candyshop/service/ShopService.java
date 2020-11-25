package com.mindtree.candyshop.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.mindtree.candyshop.entity.Shop;
import com.mindtree.candyshop.exception.ServiceException;

@Service
public interface ShopService {

	List<Shop> getShopDetails() throws ServiceException;;

	Shop addDataToShop(Shop shop) throws ServiceException;

	List<Shop> getDetailsOfShop() throws ServiceException;

	List<Shop> getFromTheFile() throws ServiceException;

	



}
