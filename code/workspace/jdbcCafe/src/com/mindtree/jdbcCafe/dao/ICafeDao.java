package com.mindtree.jdbcCafe.dao;

import java.util.List;

import com.mindtree.jdbcCafe.entity.Cafe;
import com.mindtree.jdbcCafe.entity.CafeManager;
import com.mindtree.jdbcCafe.exception.CafeDaoException;

public interface ICafeDao {

	public String addCafeManager(CafeManager manager) throws CafeDaoException;

	public String addCafe(Cafe cafe) throws CafeDaoException;

	public List<Cafe> getCafeDetails(int managerId) throws CafeDaoException;

}
