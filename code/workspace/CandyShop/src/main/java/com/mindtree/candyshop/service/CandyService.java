package com.mindtree.candyshop.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.mindtree.candyshop.entity.Candy;
import com.mindtree.candyshop.exception.ServiceException;

@Service
public interface CandyService {

	List<Candy> getCandyDetails() throws ServiceException;

	Candy addDataToCandy(Candy candy) throws ServiceException;

	double getPrice(int candy_Id, int shop_Id, int quantity) throws ServiceException;

	List<Candy> getAllCandyByShopId(int shop_Id) throws ServiceException;

	List<Candy> listOfCandyLessThanFive() throws ServiceException;

}
