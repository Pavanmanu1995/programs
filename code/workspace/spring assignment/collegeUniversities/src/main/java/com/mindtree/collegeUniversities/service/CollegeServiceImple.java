package com.mindtree.collegeUniversities.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.collegeUniversities.entity.College;
import com.mindtree.collegeUniversities.entity.University;
import com.mindtree.collegeUniversities.exception.service.ServiceException;
import com.mindtree.collegeUniversities.exception.service.UniversityNotFoundException;
import com.mindtree.collegeUniversities.exception.service.custom.CollageEmptyException;
import com.mindtree.collegeUniversities.exception.service.custom.CollegeAlreadyExistsException;
import com.mindtree.collegeUniversities.exception.service.custom.CollegeCountExceededException;
import com.mindtree.collegeUniversities.exception.service.custom.CollegeNotFoundException;
import com.mindtree.collegeUniversities.repository.CollegeRepository;
import com.mindtree.collegeUniversities.repository.UniversityRepository;

@Service
public class CollegeServiceImple implements CollegeService{
	
	@Autowired
	private CollegeRepository collegeRepository;
	
	@Autowired
	private UniversityRepository universityRepository;

	@Override
	public College addCollegeToUniversity(College college, String universityName) throws ServiceException {
		University university=universityRepository.findByUniversityName(universityName).orElseThrow(() -> new UniversityNotFoundException("university not found"));
		if (collegeRepository.findByCollegeName(college.getCollegeName()).isPresent()) {
			throw new CollegeAlreadyExistsException("College Already Exists.");
		}

		if (university.getCollegeList().size() < university.getTotalColleges()) {

			university.getCollegeList().add(college);

			college.setUniversity(university);

			collegeRepository.save(college);

			return college;
		} else {
			throw new CollegeCountExceededException("College Count Exceeded");
		}
//		if(university!=null)
//		{
//			college.setUniversity(university);
//			collegeRepository.save(college);
//		}
//		else
//		throw new UniversityNotFoundException("university not found");
//		return college;
	}

	@Override
	public Set<College> getAllColleges(int id) throws ServiceException {
		University university = universityRepository.findById(id)
				.orElseThrow(() -> new UniversityNotFoundException("University not found."));

		if (university.getCollegeList().isEmpty()) {
			throw new CollegeNotFoundException("College Not Found.");
		}
		return university.getCollegeList().stream().filter(c -> c.getTotalStudents() > 2).collect(Collectors.toSet());
//		University university=universityRepository.findById(id).orElse(null);
//		List<College> collegeList=null;
//		if(university!=null)
//		{
//			collegeList=university.getCollegeList();
//		}
//		else
//		{
//			throw new UniversityNotFoundException("university not found");
//		}
//		if(collegeList.isEmpty())
//		{
//			throw new CollageEmptyException("college is empty");
//		}
//		return collegeList;
	}

	@Override
	public College updatenumberofstudents(int collegeId, int newTotalStudent) throws ServiceException {
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
		List<College> result=new ArrayList<College>();
//		for(College c:college)
//		{
			result=college.stream().filter(r ->r .getTotalStudents()>2).collect(Collectors.toList());
//			if(c.getTotalStudents()>2)
//			{
//				collegeList.add(c);
//			}
		
		return result;
	}

	@Override
	public List<College> sortingindecendingorderoftotalstudent() {
		List<College> college=this.collegeRepository.findAll();
		Collections.sort(college);
		return college;
	}

}
