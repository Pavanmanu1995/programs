package com.mindtree.jdbcCafe.service.implementation;

import java.util.ArrayList;
import java.util.List;

import com.mindtree.jdbcCafe.dao.ICafeDao;
import com.mindtree.jdbcCafe.dao.implementation.CafeDaoImpl;
import com.mindtree.jdbcCafe.entity.Cafe;
import com.mindtree.jdbcCafe.entity.CafeManager;
import com.mindtree.jdbcCafe.exception.CafeDaoException;
import com.mindtree.jdbcCafe.exception.CafeServiceException;
import com.mindtree.jdbcCafe.exception.ManagerNotFoundException;
import com.mindtree.jdbcCafe.service.ICafeService;

public class CafeServiceImpl implements ICafeService {
ICafeDao dao=new CafeDaoImpl();
List<Cafe> cafeList=new ArrayList<Cafe>();
	@Override
	public String addCafeManager(CafeManager manager) throws CafeServiceException {
		
		try {
			String mess = dao.addCafeManager(manager);
			return mess;
		} catch (CafeDaoException e) {
			throw new CafeServiceException();
		}
		
		
	}
	@Override
	public String addCafe(Cafe cafe) throws CafeServiceException {
		String mess;
		try {
			mess = dao.addCafe(cafe);
			return mess;
		} catch (CafeDaoException e) {
			throw new CafeServiceException();
		}
		
	}
	@Override
	public List<Cafe> getCafeDetails(int managerId) throws CafeServiceException, ManagerNotFoundException {
		try {
		for(Cafe c:cafeList)
		if(c.getManagerId()==managerId)
		{
			List<Cafe> cafeList=dao.getCafeDetails(managerId);
			} 
		return cafeList;
		}
		catch (CafeDaoException e) {
			throw new ManagerNotFoundException("manager not found");
			}
		
			
		}
	}
