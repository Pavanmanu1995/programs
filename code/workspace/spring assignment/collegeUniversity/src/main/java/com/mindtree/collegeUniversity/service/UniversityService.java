package com.mindtree.collegeUniversity.service;

import com.mindtree.collegeUniversity.entity.University;
import com.mindtree.collegeUniversity.exception.service.UniversityNotFoundException;

public interface UniversityService {

	University addDataToUniversity(University university);

	Object deleteUniversity(int universityId) throws UniversityNotFoundException;

}
