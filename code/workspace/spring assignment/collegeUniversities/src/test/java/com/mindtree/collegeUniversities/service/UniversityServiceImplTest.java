package com.mindtree.collegeUniversities.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.collegeUniversities.entity.University;
import com.mindtree.collegeUniversities.exception.service.ServiceException;
import com.mindtree.collegeUniversities.repository.CollegeRepository;
import com.mindtree.collegeUniversities.repository.UniversityRepository;

@RunWith(MockitoJUnitRunner.Silent.class)
@SpringBootTest
public class UniversityServiceImplTest {
	
	@Mock
	CollegeService collegeService;

	@Mock
	UniversityService universityService;
	
	@Mock
	private CollegeRepository collegeRepository;
	
	@Mock
	private UniversityRepository universityRepository;
	
	private University university = new University();
	
	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void addDataToUniversitytest() throws ServiceException {
		university.setUniversityId(1);
		university.setUniversityName("vtu");
		university.setTotalColleges(60);
		university.setCollegeList(null);
		when(universityService.addDataToUniversity(university)).thenReturn(university);
		assertEquals(university,universityService.addDataToUniversity(university));
		
	}

}
