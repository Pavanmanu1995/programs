package com.mindtree.softwareJDBC.dao;

import java.util.List;

import com.mindtree.softwareJDBC.entity.Software;
import com.mindtree.softwareJDBC.exception.customs.SoftwareDaoException;
import com.mindtree.softwareJDBC.exception.customs.SoftwareServiceException;

public interface ISoftwareDao {
	public String addSoftware(Software software) throws SoftwareDaoException;
	List<Software> getSoftware() throws SoftwareDaoException;
	public String updateDetails(int id) throws SoftwareServiceException;

}
