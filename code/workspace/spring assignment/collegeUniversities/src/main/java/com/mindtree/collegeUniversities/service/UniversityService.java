package com.mindtree.collegeUniversities.service;

import java.util.List;
import java.util.Set;

import com.mindtree.collegeUniversities.entity.University;
import com.mindtree.collegeUniversities.exception.service.ServiceException;

public interface UniversityService {

	University addDataToUniversity(University university) throws ServiceException;

	Object deleteUniversity(int universityId) throws ServiceException;

	List<University> getUniversityData() throws ServiceException;

	void writingInExcel() throws ServiceException;

	List<String> readingFromExcel() throws ServiceException;

	Set<University> getUniversityDetails() throws ServiceException;

	Set<University> getUniversityDetail() throws ServiceException;

}
