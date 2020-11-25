package com.mindtree.campusmindapplication.dao;

import com.mindtree.campusmindapplication.entity.Lead;
import com.mindtree.campusmindapplication.exception.dao.LeadDaoException;

public interface ILeadDao {
	
	public Lead checkLeadDetail(int leadID) throws LeadDaoException;
	
	public int addLeadDetail(Lead lead) throws LeadDaoException;
	
}
