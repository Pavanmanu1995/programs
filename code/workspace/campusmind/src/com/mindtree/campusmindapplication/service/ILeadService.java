package com.mindtree.campusmindapplication.service;

import com.mindtree.campusmindapplication.entity.Lead;
import com.mindtree.campusmindapplication.exception.service.LeadServiceException;

public interface ILeadService {
	
	public String addLead(Lead lead) throws LeadServiceException;
	
	
}
