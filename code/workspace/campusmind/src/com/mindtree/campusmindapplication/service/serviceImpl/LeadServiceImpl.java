package com.mindtree.campusmindapplication.service.serviceImpl;

import com.mindtree.campusmindapplication.dao.ICampusmindDao;
import com.mindtree.campusmindapplication.dao.ILeadDao;
import com.mindtree.campusmindapplication.dao.daoImpl.CampusmindDaoImpl;
import com.mindtree.campusmindapplication.dao.daoImpl.LeadDaoImpl;
import com.mindtree.campusmindapplication.entity.CampusMind;
import com.mindtree.campusmindapplication.entity.Lead;
import com.mindtree.campusmindapplication.exception.dao.CampusmindDaoException;
import com.mindtree.campusmindapplication.exception.dao.LeadDaoException;
import com.mindtree.campusmindapplication.exception.service.CampusmindServiceException;
import com.mindtree.campusmindapplication.exception.service.LeadAlreadyExistsException;
import com.mindtree.campusmindapplication.exception.service.LeadServiceException;
import com.mindtree.campusmindapplication.exception.service.NoCampusMindExistsException;
import com.mindtree.campusmindapplication.service.ILeadService;

public class LeadServiceImpl implements ILeadService {
	ILeadDao leadDao = new LeadDaoImpl();
	
	ICampusmindDao campusmindDao=new CampusmindDaoImpl();
	
	@Override
	public String addLead(Lead lead) throws LeadServiceException {
		
		try {
			
			CampusMind cm=campusmindDao.checkCampusMindData(lead.getCampusMindID());
			
			if(cm.getCampusMindID()!=lead.getCampusMindID())
			{
				throw new NoCampusMindExistsException("Campusmind not registered");
			}
			
			Lead leadDetail = leadDao.checkLeadDetail(lead.getLeadID());
			
			if(leadDetail.getLeadID()==lead.getLeadID()) {
				throw new LeadAlreadyExistsException("Lead already registered");
			}
			
			int result=leadDao.addLeadDetail(lead);
			
			if(result==1) {
				return "Lead successfully registered";
			}
			
		} catch (CampusmindDaoException | CampusmindServiceException | LeadDaoException e) {
			throw new LeadServiceException(e.getMessage(),e);
		}
		
		return "Error in lead service";
		
		
	}
	
	

}