package com.mindtree.doccareproject.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.doccareproject.dto.HospitalDetailsDto;
import com.mindtree.doccareproject.dto.HospitalDto;
import com.mindtree.doccareproject.dto.ResponseBody;
import com.mindtree.doccareproject.entity.Hospital;
import com.mindtree.doccareproject.exception.DocCareProjectException;
import com.mindtree.doccareproject.service.HospitalService;

@RestController
public class HospitalController {

	@Autowired
	private HospitalService hospitalService;

	@Autowired
	private ModelMapper modelMapper;

	@PostMapping("/addHospital")
	public ResponseEntity<?> addHospital(@RequestBody HospitalDto hospital) throws DocCareProjectException {

		return new ResponseEntity<ResponseBody<HospitalDto>>(new ResponseBody<HospitalDto>(modelMapper
				.map(hospitalService.addHospital(modelMapper.map(hospital, Hospital.class)), HospitalDto.class), null,
				"Hospital Added Sucessfully", true), HttpStatus.OK);

	}

	@GetMapping("/getAllHospital")
	public ResponseEntity<?> getAllHospital() {
		return new ResponseEntity<ResponseBody<List<Hospital>>>(
				new ResponseBody<List<Hospital>>(hospitalService.getAllHospital(), null, "All Hospital Found", true),
				HttpStatus.OK);
	}

	@PutMapping("/updateHospital/{hospitalId}")
	public ResponseEntity<?> updateHospital(@RequestBody Hospital hospital, @PathVariable int hospitalId)
			throws DocCareProjectException {

		return new ResponseEntity<ResponseBody<Hospital>>(new ResponseBody<Hospital>(
				hospitalService.updateHospital(hospital, hospitalId), null, "Hospital Updated", true), HttpStatus.OK);
	}

	@DeleteMapping("/deletedHospital/{hospitalId}")
	public ResponseEntity<?> deletedHospital(@PathVariable int hospitalId) throws DocCareProjectException {
		hospitalService.deletedHospital(hospitalId);
		return new ResponseEntity<ResponseBody<Void>>(new ResponseBody<Void>(null, null, "Hospital Deleted", true),
				HttpStatus.OK);
	}

	@GetMapping("/totalRevanue")
	public ResponseEntity<?> totalRevnue() {

		return new ResponseEntity<ResponseBody<Double>>(
				new ResponseBody<Double>(hospitalService.totalSumOfRevenue(), null, "Total Revenue of Hospital", true),
				HttpStatus.OK);
	}

	@GetMapping("/hospitalsRevanue/{revanue}")
	public ResponseEntity<?> morRevanue(@PathVariable double revanue) {
		return new ResponseEntity<ResponseBody<List<Hospital>>>(new ResponseBody<List<Hospital>>(
				hospitalService.allHospitalOfMoreRevanue(revanue), null, "Hospitals Revenue ", true), HttpStatus.OK);
	}

	@GetMapping("/hospitalCityandRevanue")
	public ResponseEntity<?> hospitlAndRevanue() {
		return new ResponseEntity<ResponseBody<List<HospitalDetailsDto>>>(new ResponseBody<List<HospitalDetailsDto>>(
				hospitalService.hospitalCityAndRevenue(), null, "Hospital City and Revanue", true), HttpStatus.OK);
	}

}
