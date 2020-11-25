package com.mindtree.collegeUniversity.controller;

import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

@RestController
public class CollegeController {

	@Autowired
	CollegeService collegeService;

	@Autowired
	UniversityService universityService;

	@Autowired
	private ModelMapper modelMapper;

	@PostMapping("/addCollegeToUniversity/{universityId}")
	public ResponseEntity<?> addCollegeToUniversity(@Valid @RequestBody CollegeDTO college,
			@PathVariable int universityId) throws AppException {
		return new ResponseEntity<ResponseBody<CollegeDTO>>(new ResponseBody<CollegeDTO>(modelMapper.map(
				collegeService.addCollegeToUniversity(modelMapper.map(college, College.class), universityId),
				CollegeDTO.class), null, "college added successfully", true), HttpStatus.OK);
	}

	@GetMapping("/getAllColleges/{universityId}")
	public ResponseEntity<?> getAllColleges(@PathVariable int universityId) throws AppException {
		return new ResponseEntity<ResponseBody<Set<CollegeDTO>>>(new ResponseBody<Set<CollegeDTO>>(
				modelMapper.map(collegeService.getAllColleges(universityId), new TypeToken<Set<CollegeDTO>>() {
				}.getType()), null, "college list found", true), HttpStatus.OK);
	}

	@PutMapping("updatenumberofstudents/{collegeId}/{newTotalStudent}")
	public ResponseEntity<?> updatenumberofstudents(@PathVariable int collegeId, @PathVariable int newTotalStudent)
			throws AppException {
		return new ResponseEntity<ResponseBody<CollegeDTO>>(new ResponseBody<CollegeDTO>(modelMapper
				.map(collegeService.updatenumberofstudents(collegeId, newTotalStudent), new TypeToken<CollegeDTO>() {
				}.getType()), null, "college is updated", true), HttpStatus.OK);
	}

	@GetMapping("/getallcollegeshavingstudentsgreaterthantwo")
	public ResponseEntity<?> getallcollegeshavingstudentsgreaterthantwo() throws AppException {
		return new ResponseEntity<ResponseBody<List<CollegeDTO>>>(new ResponseBody<List<CollegeDTO>>(modelMapper
				.map(collegeService.getallcollegeshavingstudentsgreaterthantwo(), new TypeToken<CollegeDTO>() {
				}.getType()), null, "college list is found", true), HttpStatus.OK);

	}

	@GetMapping("/sortingindecendingorderoftotalstudent")
	public ResponseEntity<?> sortingindecendingorderoftotalstudent() throws AppException {
		return new ResponseEntity<ResponseBody<List<CollegeDTO>>>(new ResponseBody<List<CollegeDTO>>(modelMapper
				.map(collegeService.sortingindecendingorderoftotalstudent(), new TypeToken<CollegeDTO>() {
				}.getType()), null, "college list is found", true), HttpStatus.OK);
	}

}
