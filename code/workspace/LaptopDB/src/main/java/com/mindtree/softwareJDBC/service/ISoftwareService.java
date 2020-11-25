package com.mindtree.softwareJDBC.service;

import java.util.List;

import com.mindtree.softwareJDBC.entity.Software;
import com.mindtree.softwareJDBC.exception.customs.SoftwareServiceException;

public interface ISoftwareService {
	public String addSoftware(Software software) throws SoftwareServiceException;
	List<Software> getSoftware() throws SoftwareServiceException;
	public String updateDetails(int id) throws SoftwareServiceException;

}
