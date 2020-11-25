package com.mindtree.campusmindapplication.service.serviceImpl;

import java.util.List;
import java.util.Map;

import com.mindtree.campusmindapplication.dao.ICampusmindDao;
import com.mindtree.campusmindapplication.dao.daoImpl.CampusmindDaoImpl;
import com.mindtree.campusmindapplication.entity.CampusMind;
import com.mindtree.campusmindapplication.exception.dao.CampusmindDaoException;
import com.mindtree.campusmindapplication.exception.service.CampusmindAlreadyExistsException;
import com.mindtree.campusmindapplication.exception.service.CampusmindInvalidAgeException;
import com.mindtree.campusmindapplication.exception.service.CampusmindServiceException;
import com.mindtree.campusmindapplication.exception.service.LeadNotFoundException;
import com.mindtree.campusmindapplication.exception.service.NoCampusMindExistsException;
import com.mindtree.campusmindapplication.service.ICampusmindService;

public class CampusmindServiceImpl implements ICampusmindService {
	ICampusmindDao campusmindDao = new CampusmindDaoImpl();

	@Override
	public String addCampusmind(CampusMind campusMind) throws CampusmindServiceException {
		try {
			if (campusMind.getAge() < 22) {

				throw new CampusmindInvalidAgeException("Enter a valid age:: Age should be >= 22");
			}

			CampusMind cm = campusmindDao.checkCampusMindData(campusMind.getCampusMindID());

			if (cm.getCampusMindID() == campusMind.getCampusMindID()) {
				throw new CampusmindAlreadyExistsException("Campusmind already registered");
			}

			int result = campusmindDao.addCampusMindData(campusMind);
			if (result == 1) {
				return "CampusMind data stored successfully";
			}

		} catch (CampusmindDaoException e) {
			throw new CampusmindServiceException("Error in service", e);
		}

		return "Code break in service";
	}

	@Override
	public List<CampusMind> getAllCampusMinds() throws CampusmindServiceException {
		try {
			List<CampusMind> cList = campusmindDao.getCampusMindData();
			return cList;
		} catch (CampusmindDaoException e) {
			throw new CampusmindServiceException(e.getMessage(), e);
		}

	}

	@Override
	public String updateTrack(int campusmindID, String newTrack) throws CampusmindServiceException {
		try {
			int result = campusmindDao.updateTrack(campusmindID, newTrack);
			if (result == 1) {
				return "Track updated successfully";
			} else {
				throw new NoCampusMindExistsException("No campus mind with entered id found");
			}
		} catch (CampusmindDaoException e) {
			throw new CampusmindServiceException(e.getMessage(), e);
		}
	}

	@Override
	public String deleteCampusMind(int campusmindID) throws CampusmindServiceException {
		try {
			int result = campusmindDao.deleteCampusMind(campusmindID);
			if (result == 1) {
				return "CampusMind data deleted successfully";
			} else {
				throw new NoCampusMindExistsException("No campusMind with entered id found");
			}
		} catch (CampusmindDaoException e) {
			throw new CampusmindServiceException(e.getMessage(), e);
		}

	}

	@Override
	public Map<String, CampusMind> getCampusmindGivenLead(String leadName) throws CampusmindServiceException {
		Map<String, CampusMind> map;
		try {
			map = campusmindDao.getCampusmindGivenLead(leadName);

			if (map.isEmpty()) {
				throw new LeadNotFoundException("No lead with entered lead Name found");
			}

			return map;
		} catch (CampusmindDaoException | LeadNotFoundException e) {
			throw new CampusmindServiceException(e.getMessage(), e);
		}

	}

}
