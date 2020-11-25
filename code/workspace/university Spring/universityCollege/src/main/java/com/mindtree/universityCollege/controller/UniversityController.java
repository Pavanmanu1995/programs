package com.mindtree.universityCollege.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.universityCollege.Entity.Collage;
import com.mindtree.universityCollege.Entity.University;
import com.mindtree.universityCollege.exception.UniversityCollageServiceException;
import com.mindtree.universityCollege.service.CollageService;
import com.mindtree.universityCollege.service.UniversityService;

@RestController
public class UniversityController {

	@Autowired
	UniversityService universityService;

	@Autowired
	CollageService collageService;

	@PostMapping("/insert/data/university")
	public ResponseEntity<?> addDataToUniversity(@RequestBody University univesity) {
		try {
			return new ResponseEntity<>(universityService.addDataToUniversity(univesity), HttpStatus.ACCEPTED);
		} catch (UniversityCollageServiceException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

		}
	}

	@GetMapping("/get/university/details")
	public ResponseEntity<?> getUniversityDetails() {
		return new ResponseEntity<List<University>>(universityService.getUniversityDetails(), HttpStatus.OK);

	}

	@PostMapping("/insert/data/college{id}")
	public ResponseEntity<?> addDataToCollage(@RequestBody Collage collage, @RequestParam("id") int uId) {
		try {
			return new ResponseEntity<>(collageService.addDataToCollage(collage, uId), HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

		}
	}

	@GetMapping("display/all/students/greater/than/2")
	public ResponseEntity<?> listOfStudentsGreaterThan2() {
		List<Collage> collage = new ArrayList<Collage>();
		try {
			collage = this.collageService.listOfStudentsGreaterThan2();
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<List<Collage>>(collage, HttpStatus.OK);
	}

	@GetMapping(" ")
	public ResponseEntity<?> getAll() {

		return new ResponseEntity<List<University>>(universityService.getAll(), HttpStatus.OK);

	}

}
