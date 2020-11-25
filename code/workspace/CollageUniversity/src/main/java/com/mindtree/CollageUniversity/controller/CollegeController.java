package com.mindtree.CollageUniversity.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.CollageUniversity.dto.ErrorDto;
import com.mindtree.CollageUniversity.entity.College;
import com.mindtree.CollageUniversity.exception.service.UniversityNotFoundException;
import com.mindtree.CollageUniversity.exception.service.custom.CollageEmptyException;
import com.mindtree.CollageUniversity.exception.service.custom.CollegeNotFoundException;
import com.mindtree.CollageUniversity.service.CollegeService;
import com.mindtree.CollageUniversity.service.UniversityService;

@RestController
public class CollegeController {
	
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
	
	@PostMapping("/addCollegeToUniversity/{universityId}")
	public ResponseEntity<?> addCollegeToUniversity(@RequestBody College college,@PathVariable int universityId)
	{
		try {
			return new ResponseEntity<College>(this.collegeService.addCollegeToUniversity(college,universityId),HttpStatus.CREATED);
		} catch (UniversityNotFoundException e) {
			return new ResponseEntity<ErrorDto>(createErrorDto(e),HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/getAllColleges/{universityId}")
	public ResponseEntity<?> getAllColleges(@PathVariable int universityId)
	{
		try {
			return new ResponseEntity<Set<College>>(this.collegeService.getAllColleges(universityId),HttpStatus.CREATED);
		} catch (UniversityNotFoundException | CollageEmptyException e) {
			return new ResponseEntity<ErrorDto>(createErrorDto(e),HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("updatenumberofstudents/{collegeId}/{newTotalStudent}")
	public ResponseEntity<?> updatenumberofstudents(@PathVariable int collegeId,@PathVariable int newTotalStudent)
	{
		try {
			return new ResponseEntity<College>(this.collegeService.updatenumberofstudents(collegeId,newTotalStudent),HttpStatus.CREATED);
		} catch (CollegeNotFoundException e) {
			return new ResponseEntity<ErrorDto>(createErrorDto(e),HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/getallcollegeshavingstudentsgreaterthantwo")
	public ResponseEntity<?> getallcollegeshavingstudentsgreaterthantwo()
	{
		try {
			return new ResponseEntity<List<College>>(this.collegeService.getallcollegeshavingstudentsgreaterthantwo(),HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<ErrorDto>(createErrorDto(e),HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@GetMapping("/sortingindecendingorderoftotalstudent")
	public ResponseEntity<?> sortingindecendingorderoftotalstudent()
	{
		return new ResponseEntity<List<College>>(this.collegeService.sortingindecendingorderoftotalstudent(),HttpStatus.CREATED);
	}
	
	

}
