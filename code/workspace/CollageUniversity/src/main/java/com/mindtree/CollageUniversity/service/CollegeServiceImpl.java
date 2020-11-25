package com.mindtree.CollageUniversity.service;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.CollageUniversity.entity.College;
import com.mindtree.CollageUniversity.entity.University;
import com.mindtree.CollageUniversity.exception.service.UniversityNotFoundException;
import com.mindtree.CollageUniversity.exception.service.custom.CollageEmptyException;
import com.mindtree.CollageUniversity.exception.service.custom.CollegeNotFoundException;
import com.mindtree.CollageUniversity.repository.CollegeRepository;
import com.mindtree.CollageUniversity.repository.UniversityRepository;
import com.mindtree.CollageUniversity.utility.SortTotalStudent;

@Service
public class CollegeServiceImpl implements CollegeService {
	
	@Autowired
	private CollegeRepository collegeRepository;
	
	@Autowired
	private UniversityRepository universityRepository;

	@Override
	public College addCollegeToUniversity(College college, int universityId) throws UniversityNotFoundException {
		University university=this.universityRepository.findById(universityId).orElse(null);
		if(university!=null)
		{
			college.setUniversity(university);
			collegeRepository.save(college);
		}
		else
		throw new UniversityNotFoundException("university not found");
		return college;
	}

	@Override
	public Set<College> getAllColleges(int universityId) throws UniversityNotFoundException, CollageEmptyException {
		University university=this.universityRepository.findById(universityId).orElse(null);
		Set<College> collegeList=null;
		if(university!=null)
		{
			collegeList=university.getCollegeList();
		}
		else
		{
			throw new UniversityNotFoundException("university not found");
		}
		if(collegeList.isEmpty())
		{
			throw new CollageEmptyException("college is empty");
		}
		return collegeList;
	}

	@Override
	public College updatenumberofstudents(int collegeId, int newTotalStudent) throws CollegeNotFoundException {
		College college=this.collegeRepository.findById(collegeId).orElse(null);
		if(college!=null)
		{
			college.setTotalStudents(newTotalStudent);
			this.collegeRepository.save(college);
		}
		else 
			throw new CollegeNotFoundException("college not found");
		return college;
	}

	@Override
	public List<College> getallcollegeshavingstudentsgreaterthantwo() {
		List<College> college=this.collegeRepository.findAll();
		List<College> collegeList= new ArrayList<College>();
		for(College c:college)
		{
			if(c.getTotalStudents()>2)
			{
				collegeList.add(c);
			}
		}
		
		return collegeList;
	}

	@Override
	public List<College> sortingindecendingorderoftotalstudent() {
		List<College> college=this.collegeRepository.findAll();
		Collections.sort(college);
		return college;
	}
	
	
	
	

}
