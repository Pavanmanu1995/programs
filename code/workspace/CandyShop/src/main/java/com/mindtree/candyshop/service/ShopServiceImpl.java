package com.mindtree.candyshop.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.candyshop.entity.Shop;
import com.mindtree.candyshop.exception.ServiceException;
import com.mindtree.candyshop.repository.CandyRepository;
import com.mindtree.candyshop.repository.ShopRepository;

@Service
public class ShopServiceImpl implements ShopService {
	
	@Autowired
	private ShopRepository shopRepository;
	
	

	@Override
	public List<Shop> getShopDetails() throws ServiceException {
		List<Shop> shop=new ArrayList<Shop>();
		try {
			shop=this.shopRepository.findAll();
		} catch (Exception e) {
			throw new ServiceException(e);
		}

		return shop;
	}

	@Override
	public Shop addDataToShop(Shop shop) throws ServiceException {
		Shop shop1=null;
		try {
			shop=shopRepository.save(shop);
			
		} catch (Exception e) {
			throw new ServiceException(e);
		}
		
		return shop;
	}

	@Override
	public List<Shop> getDetailsOfShop() throws ServiceException {
		List<Shop> shop=new ArrayList<Shop>();
		try {
			shop=this.shopRepository.findAll();
			FileOutputStream fout=new FileOutputStream("D:\\file1.txt");
			BufferedOutputStream bout= new BufferedOutputStream(fout);
			ObjectOutputStream out=new ObjectOutputStream(bout);
			
			out.writeObject(shop);
			out.flush();
			out.close();
		} catch (Exception e) {
			throw new ServiceException(e);
		}

		return shop;
	}

	@Override
	public List<Shop> getFromTheFile() throws ServiceException {
		List<Shop> shop=new ArrayList<Shop>();
		try {
		FileInputStream fout=new FileInputStream("D:\\file1.txt");
		BufferedInputStream bis=new BufferedInputStream(fout);
		ObjectInputStream in=new ObjectInputStream(fout);
		shop = (List<Shop>)in.readObject();
		System.out.println(shop);
		in.close();
	}
		 catch (Exception e) {
				throw new ServiceException(e);
	}
		return shop;
	}

		
	}

