package com.mindtree.jdbcCafe.service;

import java.util.List;

import com.mindtree.jdbcCafe.entity.Cafe;
import com.mindtree.jdbcCafe.entity.CafeManager;
import com.mindtree.jdbcCafe.exception.CafeServiceException;
import com.mindtree.jdbcCafe.exception.ManagerNotFoundException;

public interface ICafeService {

	public String addCafeManager(CafeManager manager) throws CafeServiceException;

	public String addCafe(Cafe cafe) throws CafeServiceException;

	public List<Cafe> getCafeDetails(int managerId) throws CafeServiceException, ManagerNotFoundException;

}
