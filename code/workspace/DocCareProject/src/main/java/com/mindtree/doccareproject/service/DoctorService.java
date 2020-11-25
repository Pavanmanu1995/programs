package com.mindtree.doccareproject.service;

import java.util.List;

import com.mindtree.doccareproject.dto.DoctorDetailsDto;
import com.mindtree.doccareproject.entity.Doctor;
import com.mindtree.doccareproject.exception.service.DocCareProjectServiceException;

public interface DoctorService {
	public List<Doctor> allDoctorOfHospital(int hospitalId) throws DocCareProjectServiceException;

	public Doctor addDoctor(Doctor doctor, int hospitalId) throws DocCareProjectServiceException;

	public void deletedDoctor(int doctorId) throws DocCareProjectServiceException;

	public Doctor updateDoctor(Doctor doctor, String doctorName) throws DocCareProjectServiceException;

	public List<DoctorDetailsDto> allTheDoctorsWihoutAge(int hospitalId) throws DocCareProjectServiceException;

}
