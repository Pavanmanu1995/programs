package com.mindtree.universityCollege.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.universityCollege.Entity.University;
import com.mindtree.universityCollege.Utility.SortStudents;
import com.mindtree.universityCollege.exception.UniversityCollageServiceException;
import com.mindtree.universityCollege.repository.UniversityRepo;

@Service
public class UniversityServiceImpl implements UniversityService {
	
	@Autowired
	UniversityRepo repo;
	

	@Override
	public Object addDataToUniversity(University univesity) throws UniversityCollageServiceException {
		University university=repo.save(univesity);
		return university;
	}

	@Override
	public List<University> getUniversityDetails() {
		List<University> universityList=repo.findAll();
		return universityList;
	}

	@Override
	public List<University> getAll() {
		List<University> list = repo.findAll();

		for (University university : list) {
			Collections.sort(university.getCollageList(), new SortStudents());
			university.toString();
		}

		
		return list;
	}

			

}
