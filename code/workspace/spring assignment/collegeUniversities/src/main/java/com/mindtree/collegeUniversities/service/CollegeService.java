package com.mindtree.collegeUniversities.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.mindtree.collegeUniversities.entity.College;
import com.mindtree.collegeUniversities.exception.service.ServiceException;


@Service
public interface CollegeService {

	College addCollegeToUniversity(College college, String universityName) throws ServiceException;

	Set<College> getAllColleges(int id) throws ServiceException;

	College updatenumberofstudents(int collegeId, int newTotalStudent) throws ServiceException;

	List<College> getallcollegeshavingstudentsgreaterthantwo();

	List<College> sortingindecendingorderoftotalstudent();

}
