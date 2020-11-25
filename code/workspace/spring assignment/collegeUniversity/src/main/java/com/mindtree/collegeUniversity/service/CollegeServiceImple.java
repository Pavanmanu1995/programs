package com.mindtree.collegeUniversity.service;

import org.springframework.stereotype.Service;

import com.mindtree.collegeUniversity.repository.CollegeRepository;

@Service
public class CollegeServiceImple implements CollegeService{
	
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
		List<College> result=new ArrayList<College>();
//		for(College c:college)
//		{
			result=collegeList.stream().filter(r ->r .getTotalStudents()>2).collect(Collectors.toList());
//			if(c.getTotalStudents()>2)
//			{
//				collegeList.add(c);
//			}
		}
		
		return result;
	}

	@Override
	public List<College> sortingindecendingorderoftotalstudent() {
		List<College> college=this.collegeRepository.findAll();
		Collections.sort(college);
		return college;
	}

}
