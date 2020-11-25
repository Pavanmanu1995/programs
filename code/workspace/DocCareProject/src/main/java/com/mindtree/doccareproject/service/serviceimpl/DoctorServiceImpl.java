package com.mindtree.doccareproject.service.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.doccareproject.dto.DoctorDetailsDto;
import com.mindtree.doccareproject.entity.Doctor;
import com.mindtree.doccareproject.entity.Hospital;
import com.mindtree.doccareproject.exception.service.DocCareProjectServiceException;
import com.mindtree.doccareproject.exception.service.custom.DoctorNotFoundException;
import com.mindtree.doccareproject.exception.service.custom.HospitalNotFoundException;
import com.mindtree.doccareproject.repository.DoctorRepository;
import com.mindtree.doccareproject.repository.HospitalRepository;
import com.mindtree.doccareproject.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;

	@Autowired
	private HospitalRepository hospitalRepository;

	public Doctor addDoctor(Doctor doctor, int hospitalId) throws DocCareProjectServiceException {
		Hospital hospital = hospitalRepository.findById(hospitalId)
				.orElseThrow(() -> new HospitalNotFoundException("Hospital is not Exist"));

		List<Doctor> d1 = hospital.getDoctors().stream()
				.filter(d -> d.getDoctorName().equalsIgnoreCase(doctor.getDoctorName())).collect(Collectors.toList());

		doctor.setHospital(hospital);
		Doctor doctor2 = doctorRepository.save(doctor);
		List<Doctor> doctor1 = hospital.getDoctors();
		doctor1.add(doctor);
		hospital.setDoctors(doctor1);
		this.hospitalRepository.save(hospital);
		return doctor2;
	}

	@Override
	public void deletedDoctor(int doctorId) {
		doctorRepository.deleteById(doctorId);

	}

	@Override
	public Doctor updateDoctor(Doctor doctor, String doctorName) throws DocCareProjectServiceException {
		doctorRepository.findByDoctorName(doctor.getDoctorName())
				.orElseThrow(() -> new DoctorNotFoundException("Doctor Not Found"));

		return doctorRepository.save(doctor);
	}

	@Override
	public List<Doctor> allDoctorOfHospital(int hospitalId) throws DocCareProjectServiceException {
		Hospital hospital = hospitalRepository.findById(hospitalId)
				.orElseThrow(() -> new HospitalNotFoundException(" Hospital is not Exist"));
		return hospital.getDoctors();
	}

	public List<DoctorDetailsDto> allTheDoctorsWihoutAge(int hospitalId) throws DocCareProjectServiceException {
		Hospital hospital = hospitalRepository.findById(hospitalId)
				.orElseThrow(() -> new HospitalNotFoundException(" Hospital is not Exist"));
		return hospital.getDoctors().stream().map(doctor -> convertToDoctorDto(doctor)).collect(Collectors.toList());
	}

	DoctorDetailsDto convertToDoctorDto(Doctor doctor) {
		DoctorDetailsDto doctorDetailsDto = new DoctorDetailsDto();
		doctorDetailsDto.setDoctorId(doctor.getDoctorId());
		doctorDetailsDto.setDoctorName(doctor.getDoctorName());
		doctorDetailsDto.setDoctorAddress(doctor.getDoctorAddress());
		doctorDetailsDto.setDoctorSalary(doctor.getDoctorSalary());
		doctorDetailsDto.setDoctorsSpecialty(doctor.getDoctorsSpecialty());

		return doctorDetailsDto;

	}
}
