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

import com.mindtree.doccareproject.dto.DoctorDetailsDto;
import com.mindtree.doccareproject.dto.DoctorDto;
import com.mindtree.doccareproject.dto.ResponseBody;
import com.mindtree.doccareproject.entity.Doctor;
import com.mindtree.doccareproject.exception.DocCareProjectException;
import com.mindtree.doccareproject.service.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	@Autowired
	private ModelMapper modelMapper;

	@PostMapping("/addDoctors/{hospitalId}")
	public ResponseEntity<?> addDoctors(@RequestBody DoctorDto doctor, @PathVariable int hospitalId)
			throws DocCareProjectException {
		return new ResponseEntity<ResponseBody<DoctorDto>>(new ResponseBody<DoctorDto>(modelMapper
				.map(doctorService.addDoctor(modelMapper.map(doctor, Doctor.class), hospitalId), DoctorDto.class), null,
				"Doctor is Added Succesfully", true), HttpStatus.OK);

	}

	@PutMapping("/updateDoctors/{doctorName}")
	public ResponseEntity<?> updateDoctors(@RequestBody Doctor doctor, String doctorName)
			throws DocCareProjectException {

		return new ResponseEntity<ResponseBody<Doctor>>(
				new ResponseBody<Doctor>(doctorService.updateDoctor(doctor, doctorName), null,
						"Doctor is Updated Succesfully", true),
				HttpStatus.OK);
	}

	@DeleteMapping("/deletedDoctors/{doctorId}")
	public ResponseEntity<?> deletedDoctors(@PathVariable int doctorId) throws DocCareProjectException {
		doctorService.deletedDoctor(doctorId);
		return new ResponseEntity<ResponseBody<Void>>(
				new ResponseBody<Void>(null, null, "Doctor is Deleted Succesfully", true), HttpStatus.OK);
	}

	@GetMapping("/getAllDoctors/{hospitalId}")
	public ResponseEntity<?> getAllDoctors(@PathVariable int hospitalId) throws DocCareProjectException {

		return new ResponseEntity<ResponseBody<List<Doctor>>>(new ResponseBody<List<Doctor>>(
				doctorService.allDoctorOfHospital(hospitalId), null, "All Doctors In hospital", true), HttpStatus.OK);
	}

	@GetMapping("/getAllDoctorsiInHospital/{hospitalId}")
	public ResponseEntity<?> getAllDoctorInHospitalWithoutAge(@PathVariable int hospitalId)
			throws DocCareProjectException {

		return new ResponseEntity<ResponseBody<List<DoctorDetailsDto>>>(
				new ResponseBody<List<DoctorDetailsDto>>(doctorService.allTheDoctorsWihoutAge(hospitalId), null,
						"All Doctors data in hospital without Age", true),
				HttpStatus.OK);
	}

}
