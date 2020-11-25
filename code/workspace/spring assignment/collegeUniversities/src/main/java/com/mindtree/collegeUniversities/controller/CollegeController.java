package com.mindtree.collegeUniversities.controller;

import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.collegeUniversities.dto.CollegeDTO;
import com.mindtree.collegeUniversities.dto.ResponseBody;
import com.mindtree.collegeUniversities.entity.College;
import com.mindtree.collegeUniversities.exception.AppException;
import com.mindtree.collegeUniversities.service.CollegeService;
import com.mindtree.collegeUniversities.service.UniversityService;

@RestController
public class CollegeController {

	@Autowired
	CollegeService collegeService;

	@Autowired
	UniversityService universityService;

	@Autowired
	private ModelMapper modelMapper;

	@PostMapping("/addCollegeToUniversity/{universityName}")
	public ResponseEntity<?> addCollegeToUniversity(@Valid @RequestBody CollegeDTO college,
			@PathVariable String universityName) throws AppException {
		return new ResponseEntity<ResponseBody<CollegeDTO>>(new ResponseBody<CollegeDTO>(modelMapper.map(
				collegeService.addCollegeToUniversity(modelMapper.map(college, College.class), universityName),
				CollegeDTO.class), null, "college added successfully", true), HttpStatus.OK);
	}

	@GetMapping("/getAllColleges/{universityId}")
	public ResponseEntity<?> getAllColleges(@PathVariable int universityId) throws AppException {
		return new ResponseEntity<ResponseBody<Set<CollegeDTO>>>(new ResponseBody<Set<CollegeDTO>>(
				modelMapper.map(collegeService.getAllColleges(universityId), new TypeToken<Set<CollegeDTO>>() {
				}.getType()), null, "college list found", true), HttpStatus.OK);
	}

	@PutMapping("/updatenumberofstudents/{collegeId}/{totalStudents}")
	public ResponseEntity<?> updatenumberofstudents(@PathVariable int collegeId, @PathVariable int totalStudents)
			throws AppException {
		return new ResponseEntity<ResponseBody<CollegeDTO>>(new ResponseBody<CollegeDTO>(
				modelMapper.map(collegeService.updatenumberofstudents(collegeId, totalStudents), CollegeDTO.class),
				null, "college is updated", true), HttpStatus.OK);
	}

	@GetMapping("/getallcollegeshavingstudentsgreaterthantwo")
	public ResponseEntity<?> getallcollegeshavingstudentsgreaterthantwo() throws AppException {
		return new ResponseEntity<ResponseBody<List<CollegeDTO>>>(new ResponseBody<List<CollegeDTO>>(modelMapper
				.map(collegeService.getallcollegeshavingstudentsgreaterthantwo(), new TypeToken<List<CollegeDTO>>() {
				}.getType()), null, "college list is found", true), HttpStatus.OK);

	}

	@GetMapping("/sortingindecendingorderoftotalstudent")
	public ResponseEntity<?> sortingindecendingorderoftotalstudent() throws AppException {
		return new ResponseEntity<ResponseBody<List<CollegeDTO>>>(new ResponseBody<List<CollegeDTO>>(
				modelMapper.map(collegeService.sortingindecendingorderoftotalstudent(), new TypeToken<List<CollegeDTO>>() {
				}.getType()), null, "college list is found", true), HttpStatus.OK);
	}

}
