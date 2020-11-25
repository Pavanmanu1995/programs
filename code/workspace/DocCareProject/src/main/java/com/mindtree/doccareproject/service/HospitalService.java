package com.mindtree.doccareproject.service;

import java.util.List;

import com.mindtree.doccareproject.dto.HospitalDetailsDto;
import com.mindtree.doccareproject.entity.Hospital;
import com.mindtree.doccareproject.exception.service.DocCareProjectServiceException;

public interface HospitalService {

	public Hospital addHospital(Hospital hospital) throws DocCareProjectServiceException;

	public Hospital updateHospital(Hospital hospital, int hospitalId) throws DocCareProjectServiceException;

	public void deletedHospital(int hospitalId) throws DocCareProjectServiceException;

	public List<Hospital> getAllHospital();

	public double totalSumOfRevenue();

	public List<Hospital> allHospitalOfMoreRevanue(double revanue);

	public List<HospitalDetailsDto> hospitalCityAndRevenue();

}
