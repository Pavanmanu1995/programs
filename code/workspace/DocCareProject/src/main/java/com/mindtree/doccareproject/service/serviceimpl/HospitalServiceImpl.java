package com.mindtree.doccareproject.service.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.doccareproject.dto.HospitalDetailsDto;
import com.mindtree.doccareproject.entity.Hospital;
import com.mindtree.doccareproject.exception.service.DocCareProjectServiceException;
import com.mindtree.doccareproject.exception.service.custom.HospitalAlReadyExistException;
import com.mindtree.doccareproject.exception.service.custom.HospitalNotFoundException;
import com.mindtree.doccareproject.repository.HospitalRepository;
import com.mindtree.doccareproject.service.HospitalService;

@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalRepository hospitalRepository;

	@Override
	public Hospital addHospital(Hospital hospital) throws DocCareProjectServiceException {

		if (hospitalRepository.findByHospitalName(hospital.getHospitalName()).isPresent())
			throw new HospitalAlReadyExistException("Hospital AlReady Exist");

		return hospitalRepository.save(hospital);
	}

	@Override
	public Hospital updateHospital(Hospital hospital, int hospitalId) throws DocCareProjectServiceException {

		Hospital hospital2 = hospitalRepository.findById(hospitalId)
				.orElseThrow(() -> new HospitalNotFoundException("Hospital Not Found"));

		hospital2.setHospitalName(hospital.getHospitalName());
		hospital2.setHospitalAddress(hospital.getHospitalAddress());
		hospital2.setHospitalRevenue(hospital.getHospitalRevenue());
		return this.hospitalRepository.save(hospital2);
	}

	@Override
	public void deletedHospital(int hospitalId) throws DocCareProjectServiceException {
		hospitalRepository.findById(hospitalId).orElseThrow(() -> new HospitalNotFoundException("Hospital Not Found"));

		hospitalRepository.deleteById(hospitalId);
	}

	@Override
	public List<Hospital> getAllHospital() {
		return hospitalRepository.findAll();
	}

	@Override
	public double totalSumOfRevenue() {
		return this.hospitalRepository.findAll().stream().map(x -> x.getHospitalRevenue()).collect(Collectors.toList())
				.stream().reduce((double) 0, (a, b) -> a + b);

	}

	@Override
	public List<Hospital> allHospitalOfMoreRevanue(double revanue) {
		return this.hospitalRepository.findAll().stream().filter(hospital -> hospital.getHospitalRevenue() > revanue)
				.collect(Collectors.toList());

	}

	@Override
	public List<HospitalDetailsDto> hospitalCityAndRevenue() {
		return this.hospitalRepository.findAll().stream().map(hospital -> convertHospitalToHospitalDto(hospital))
				.collect(Collectors.toList());

	}

	public HospitalDetailsDto convertHospitalToHospitalDto(Hospital hospital) {
		HospitalDetailsDto hospitalDetailsDto = new HospitalDetailsDto();
		hospitalDetailsDto.setHospitalAddress(hospital.getHospitalAddress());
		hospitalDetailsDto.setHospitalrevenue(hospital.getHospitalRevenue());
		return hospitalDetailsDto;

	}

}
