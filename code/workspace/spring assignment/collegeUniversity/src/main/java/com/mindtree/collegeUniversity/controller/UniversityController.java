package com.mindtree.collegeUniversity.controller;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.collegeUniversity.dto.ErrorDto;
import com.mindtree.collegeUniversity.dto.ResponseBody;
import com.mindtree.collegeUniversity.dto.UniversityDTO;
import com.mindtree.collegeUniversity.entity.University;
import com.mindtree.collegeUniversity.exception.AppException;
import com.mindtree.collegeUniversity.exception.service.UniversityNotFoundException;
import com.mindtree.collegeUniversity.service.CollegeService;
import com.mindtree.collegeUniversity.service.UniversityService;



@RestController
public class UniversityController {
	
	@Autowired
	CollegeService collegeService;
	
	@Autowired
	UniversityService universityService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@PostMapping("/addDataToUniversity")
	public ResponseEntity<?> addDataToUniversity(@Valid @RequestBody UniversityDTO university) throws AppException
	{
		return new ResponseEntity<ResponseBody<UniversityDTO>>(
				new ResponseBody<UniversityDTO>(
						modelMapper.map(universityService.addDataToUniversity(
								modelMapper.map(university, University.class)), UniversityDTO.class),
						null, "university Added successfully", true),
				HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteUniversity/{universityId}")
	public ResponseEntity<?> deleteUniversity(@PathVariable int universityId) throws AppException
	{
		universityService.deleteUniversity(universityId);
		return new ResponseEntity<ResponseBody<Void>>(new ResponseBody<Void>(null,null, "booking portal is deleted", true),HttpStatus.OK);
	}
	

}
