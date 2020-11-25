package com.mindtree.softwareJDBC.service;

import java.util.List;

import com.mindtree.softwareJDBC.dao.ISoftwareDao;
import com.mindtree.softwareJDBC.dao.SoftwareDaoImp;
import com.mindtree.softwareJDBC.entity.Software;
import com.mindtree.softwareJDBC.exception.customs.SoftwareDaoException;
import com.mindtree.softwareJDBC.exception.customs.SoftwareServiceException;

public class SoftwareServiceImp implements ISoftwareService {

	public String addSoftware(Software software) throws SoftwareServiceException {
		ISoftwareDao dao=new SoftwareDaoImp();
		try {
			String mess=dao.addSoftware(software);
			return mess;
		} catch (SoftwareDaoException e) {
			throw new SoftwareServiceException();
		}
	}

	public List<Software> getSoftware() throws SoftwareServiceException {
		ISoftwareDao dao=new SoftwareDaoImp();
		try {
			List<Software> softwareList=dao.getSoftware();
			return softwareList;
		}
		
		catch (SoftwareDaoException e) {
			throw new SoftwareServiceException();
		}
		
	}

	public String updateDetails(int id) throws SoftwareServiceException {
		ISoftwareDao dao=new SoftwareDaoImp();
		try {
			String mess=dao.updateDetails(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return mess;
	}

}
