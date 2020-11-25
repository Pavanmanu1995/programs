package com.mindtree.campusmindapplication.dao;

import java.util.List;
import java.util.Map;

import com.mindtree.campusmindapplication.entity.CampusMind;
import com.mindtree.campusmindapplication.exception.dao.CampusmindDaoException;

public interface ICampusmindDao {
	
	public CampusMind checkCampusMindData(int campusmindId) throws CampusmindDaoException;
	
	public int addCampusMindData(CampusMind campusmind) throws CampusmindDaoException;
	
	public List<CampusMind> getCampusMindData() throws CampusmindDaoException;
	
	public int updateTrack(int campusmindId,String newTrack) throws CampusmindDaoException;
	
	public int deleteCampusMind(int campusmindId) throws CampusmindDaoException;
	
	public Map<String,CampusMind> getCampusmindGivenLead(String leadName) throws CampusmindDaoException;
}
 