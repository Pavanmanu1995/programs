package com.mindtree.universityCollege.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.universityCollege.Entity.Collage;
import com.mindtree.universityCollege.Entity.University;
import com.mindtree.universityCollege.exception.UniversityCollageServiceException;

@Service
public interface UniversityService {

	Object addDataToUniversity(University univesity) throws UniversityCollageServiceException;

	List<University> getUniversityDetails();

	List<University> getAll();


}
