package com.mindtree.CollageUniversity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.CollageUniversity.dto.ErrorDto;
import com.mindtree.CollageUniversity.entity.University;
import com.mindtree.CollageUniversity.exception.service.UniversityNotFoundException;
import com.mindtree.CollageUniversity.service.CollegeService;
import com.mindtree.CollageUniversity.service.UniversityService;

@RestController
public class UniversityController {
	
	@Autowired
	CollegeService collegeService;
	
	@Autowired
	UniversityService universityService;
	
	public ErrorDto createErrorDto(Exception e) {
		ErrorDto dto = new ErrorDto();
		dto.setErrorType(e.getClass().getCanonicalName());
		dto.setMessage(e.getMessage());
		return dto;
	}
	
	@PostMapping("/addDataToUniversity")
	public ResponseEntity<?> addDataToUniversity(@RequestBody University university)
	{
		return new ResponseEntity<University>(this.universityService.addDataToUniversity(university),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteUniversity/{universityId}")
	public ResponseEntity<?> deleteUniversity(@PathVariable int universityId)
	{
		try {
			return new ResponseEntity<>(this.universityService.deleteUniversity(universityId),HttpStatus.CREATED);
		} catch (UniversityNotFoundException e) {
			return new ResponseEntity<ErrorDto>(createErrorDto(e),HttpStatus.BAD_REQUEST);
		}
	}
	

}
