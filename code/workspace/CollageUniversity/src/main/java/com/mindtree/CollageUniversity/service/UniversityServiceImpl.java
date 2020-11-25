package com.mindtree.CollageUniversity.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.CollageUniversity.entity.University;
import com.mindtree.CollageUniversity.exception.service.UniversityNotFoundException;
import com.mindtree.CollageUniversity.repository.CollegeRepository;
import com.mindtree.CollageUniversity.repository.UniversityRepository;

@Service
public class UniversityServiceImpl implements UniversityService {
	
	@Autowired
	private CollegeRepository collegeRepository;
	
	@Autowired
	private UniversityRepository universityRepository;


	@Override
	public University addDataToUniversity(University university) 
	{
		return this.universityRepository.save(university);
	}


	@Override
	public Object deleteUniversity(int universityId) throws UniversityNotFoundException {
		University university=this.universityRepository.findById(universityId).orElse(null);
		Set<University> universityList=null;
		if(university!=null)
		{
			universityRepository.delete(university);
		}
		else
		{
			throw new UniversityNotFoundException("university not found");
		}
		return "deleted successfully";
	}

}
