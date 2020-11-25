package com.mindtree.CollageUniversity.service;

import com.mindtree.CollageUniversity.entity.University;
import com.mindtree.CollageUniversity.exception.service.UniversityNotFoundException;

public interface UniversityService {

	University addDataToUniversity(University university);

	Object deleteUniversity(int universityId) throws UniversityNotFoundException;

}
