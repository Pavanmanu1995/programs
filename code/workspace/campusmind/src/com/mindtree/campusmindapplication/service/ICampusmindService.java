package com.mindtree.campusmindapplication.service;

import java.util.List;
import java.util.Map;

import com.mindtree.campusmindapplication.entity.CampusMind;
import com.mindtree.campusmindapplication.exception.service.CampusmindServiceException;

public interface ICampusmindService {
	public String addCampusmind(CampusMind campusMind) throws CampusmindServiceException;
	
	public List<CampusMind> getAllCampusMinds() throws CampusmindServiceException;
	
	public String updateTrack(int campusmindID,String newTrack) throws CampusmindServiceException;
	
	public String deleteCampusMind(int campusmindID) throws CampusmindServiceException;
	
	public Map<String,CampusMind> getCampusmindGivenLead(String leadName) throws CampusmindServiceException;
}
