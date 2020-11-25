package com.mindtree.candyshop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.candyshop.entity.Candy;
import com.mindtree.candyshop.exception.ServiceException;
import com.mindtree.candyshop.repository.CandyRepository;

@Service
public class CandyServiceImpl implements CandyService {

	@Autowired
	private CandyRepository candyRepository;

	@Override
	public List<Candy> getCandyDetails() throws ServiceException {
		List<Candy> candy=new ArrayList<Candy>();
		try {
			candy = this.candyRepository.findAll();
			
		} catch (Exception e) {
			throw new ServiceException(e);
		}
		return candy;
	}

	@Override
	public Candy addDataToCandy(Candy candy) throws ServiceException {
		Candy candy1=null;
		try {
			candy1=candyRepository.save(candy);
		} catch (Exception e) {
			throw new ServiceException(e);
		}
		return  candy1;
	}

	@Override
	public double getPrice(int candy_Id, int shop_Id, int quantity) throws ServiceException {
		List<Candy> candy = this.candyRepository.findAll();
		Candy c = new Candy();
		try {
			for (int i = 0; i < candy.size(); i++)
				if (candy.get(i).getShop().getId() == shop_Id)
					if (candy.get(i).getId() == candy_Id && candy.get(i).getStock() > quantity) {
						c = candy.get(i);
					}
			double price = quantity * c.getPrice() + (c.getPrice() * 1.2) + (c.getPrice() * 1.02);
			return price;
		} catch (Exception e) {
			throw new ServiceException(e);
		}
		
	}

	@Override
	public List<Candy> getAllCandyByShopId(int shop_Id) throws ServiceException {
		List<Candy> candy = this.candyRepository.findAll();
		List<Candy> candies = new ArrayList<Candy>();
		for (int i = 0; i < candy.size(); i++)
			if (candy.get(i).getShop().getId() == shop_Id) {
				candies.add(candy.get(i));
			}
		return candy;

	}

	@Override
	public List<Candy> listOfCandyLessThanFive() throws ServiceException {
		List<Candy> candy = this.candyRepository.findAll();
		List<Candy> candies = new ArrayList<Candy>();
		for (int i = 0; i < candy.size(); i++)
			if (candy.get(i).getStock() < 5) {
				candies.add(candy.get(i));
			}
		return candies;

	}
}
