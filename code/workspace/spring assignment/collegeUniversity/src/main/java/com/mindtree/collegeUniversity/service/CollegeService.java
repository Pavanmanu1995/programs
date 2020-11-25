package com.mindtree.collegeUniversity.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.mindtree.collegeUniversity.entity.College;
import com.mindtree.collegeUniversity.exception.service.UniversityNotFoundException;
import com.mindtree.collegeUniversity.exception.service.custom.CollageEmptyException;
import com.mindtree.collegeUniversity.exception.service.custom.CollegeNotFoundException;


@Service
public interface CollegeService {

	College addCollegeToUniversity(College college, int universityId) throws ServiceException;

	Set<College> getAllColleges(int universityId) throws UniversityNotFoundException, CollageEmptyException;

	College updatenumberofstudents(int collegeId, int newTotalStudent) throws CollegeNotFoundException;

	List<College> getallcollegeshavingstudentsgreaterthantwo();

	List<College> sortingindecendingorderoftotalstudent();

}