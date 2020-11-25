package com.mindtree.collegeUniversities.funcInterface;

import com.mindtree.collegeUniversities.entity.University;
import com.mindtree.collegeUniversities.exception.service.ServiceException;

public interface FuncInterface {
	public University function() throws ServiceException;

}
