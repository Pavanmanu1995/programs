package com.mindtree.collegeUniversities.controller;

import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.collegeUniversities.dto.ResponseBody;
import com.mindtree.collegeUniversities.dto.UniversityDTO;
import com.mindtree.collegeUniversities.entity.University;
import com.mindtree.collegeUniversities.exception.AppException;
import com.mindtree.collegeUniversities.service.CollegeService;
import com.mindtree.collegeUniversities.service.UniversityService;

@RestController
public class UniversityController {

	@Autowired
	CollegeService collegeService;

	@Autowired
	UniversityService universityService;

	@Autowired
	private ModelMapper modelMapper;

	@PostMapping("/addDataToUniversity")
	public ResponseEntity<?> addDataToUniversity(@Valid @RequestBody UniversityDTO university) throws AppException {
		return new ResponseEntity<ResponseBody<UniversityDTO>>(new ResponseBody<UniversityDTO>(
				modelMapper.map(universityService.addDataToUniversity(modelMapper.map(university, University.class)),
						UniversityDTO.class),
				null, "university Added successfully", true), HttpStatus.OK);
	}

	@GetMapping("/getUniversity")
	public ResponseEntity<?> getUniversityData() throws AppException {
		return new ResponseEntity<ResponseBody<List<UniversityDTO>>>(new ResponseBody<List<UniversityDTO>>(
				modelMapper.map(universityService.getUniversityData(), new TypeToken<List<UniversityDTO>>() {
				}.getType()), null, "university is found", true), HttpStatus.OK);
	}

	@DeleteMapping("/deleteUniversity/{universityId}")
	public ResponseEntity<?> deleteUniversity(@PathVariable int universityId) throws AppException {
		universityService.deleteUniversity(universityId);
		return new ResponseEntity<ResponseBody<Void>>(new ResponseBody<Void>(null, null, "university is deleted", true),
				HttpStatus.OK);
	}

	@GetMapping("/university/writtinginexcel")
	public ResponseEntity<?> writtingIntoExcel() throws AppException {

		universityService.writingInExcel();

		return new ResponseEntity<ResponseBody<Void>>(
				new ResponseBody<Void>(null, null, "Writting Into Excel Is Done", true), HttpStatus.OK);

	}

	@GetMapping("/university/readingfromexcel")
	public ResponseEntity<?> readingFromExcel() throws AppException {

		return new ResponseEntity<ResponseBody<List<String>>>(new ResponseBody<List<String>>(
				universityService.readingFromExcel(), null, "Reading From Excel is Done", true), HttpStatus.OK);

	}
	
	@GetMapping("/serilazation")
	public ResponseEntity<?> getUniversityDetails() throws AppException {
		return new ResponseEntity<ResponseBody<Set<UniversityDTO>>>(new ResponseBody<Set<UniversityDTO>>(
				modelMapper.map(universityService.getUniversityDetails(), new TypeToken<Set<UniversityDTO>>() {
				}.getType()), null, "university details are serialized", true), HttpStatus.OK);
	}
	
	@GetMapping("/deserilazation")
	public ResponseEntity<?> getUniversityDetail() throws AppException {
		return new ResponseEntity<ResponseBody<Set<UniversityDTO>>>(new ResponseBody<Set<UniversityDTO>>(
				modelMapper.map(universityService.getUniversityDetail(), new TypeToken<Set<UniversityDTO>>() {
				}.getType()), null, "university details are deserialized", true), HttpStatus.OK);
	}

}
