package com.mindtree.CollageUniversity.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.mindtree.CollageUniversity.entity.College;
import com.mindtree.CollageUniversity.exception.service.UniversityNotFoundException;
import com.mindtree.CollageUniversity.exception.service.custom.CollageEmptyException;
import com.mindtree.CollageUniversity.exception.service.custom.CollegeNotFoundException;

@Service
public interface CollegeService {

	College addCollegeToUniversity(College college, int universityId) throws UniversityNotFoundException;

	Set<College> getAllColleges(int universityId) throws UniversityNotFoundException, CollageEmptyException;

	College updatenumberofstudents(int collegeId, int newTotalStudent) throws CollegeNotFoundException;

	List<College> getallcollegeshavingstudentsgreaterthantwo();

	List<College> sortingindecendingorderoftotalstudent();

}
