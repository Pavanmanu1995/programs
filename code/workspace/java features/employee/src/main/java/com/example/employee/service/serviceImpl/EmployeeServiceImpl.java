package com.example.employee.service.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.annotations.Check;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.dto.EmployeeDTO;
import com.example.employee.entity.Designation;
import com.example.employee.entity.Employee;
import com.example.employee.exception.service.EmployeeServiceException;
import com.example.employee.repository.EmployeeRepository;
import com.example.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	private List<Employee> convertingEmployeeDTOToEmployee(List<EmployeeDTO> employeeDTO)
			throws EmployeeServiceException {
		return employeeDTO.stream().map(eDTO -> mapToEmployee(eDTO)).collect(Collectors.toList());
	}

	@Override
	public List<Employee> addEmployeeDetails(List<EmployeeDTO> employeeDTO) throws EmployeeServiceException {

		return convertingEmployeeDTOToEmployee(employeeDTO).stream().map(e -> this.employeeRepository.save(e))
				.collect(Collectors.toList());
	}
	
	private Employee mapToEmployee(EmployeeDTO employeeDTO)
	{
		Employee employee=new Employee();
		employee.setEmployeeId(employeeDTO.getEmployeeId());
		employee.setEmployeeName(employeeDTO.getEmployeeName());
		employee.setEmployeeAge(employeeDTO.getEmployeeAge());
		employee.setDesignation(checkDesignation(employeeDTO));
		employee.setSalary(employeeDTO.getSalary());
		return employee;
	}
	
	private Designation checkDesignation(EmployeeDTO employeeDTO)
	{
		String competency=employeeDTO.getCompetency();
		switch(competency)
		{
		case "c1":
			return Designation.ENGINEER;
			
		case "c2":
		return Designation.SENIOR_ENGINEER;
		
		case "c3":
		return Designation.MODULE_LEAD;
		
		case "c4":
			return Designation.ARCHITECT;
			
		case "c5":
			return Designation.MANAGER;
			
		default:
			return Designation.ENGINEER;
		}
	}

	@Override
	public double totalSalary() throws EmployeeServiceException {
		List<Employee> employee=this.employeeRepository.findAll();
		List<Double> salary=employee.stream().map(x->x.getSalary()).collect(Collectors.toList());
		double totalSalary=salary.stream().reduce((double)0,(a,b)-> a+b);
		return totalSalary;
	}

	@Override
	public List<Employee> seniorEnginner() throws EmployeeServiceException {
		List<Employee> employee=this.employeeRepository.findAll();
		Designation designation=Designation.SENIOR_ENGINEER;
		List<Employee> seniorEngineer=employee.stream().filter(x->x.getDesignation().compareTo(designation)==0).collect(Collectors.toList());
		return seniorEngineer;
	}

	@Override
	public int noOfEnginner() throws EmployeeServiceException {
		List<Employee> employee=this.employeeRepository.findAll();
		Designation designation=Designation.ENGINEER;
		List<Employee> engineer=employee.stream().filter(x->x.getDesignation().compareTo(designation)==0).collect(Collectors.toList());
		return engineer.size();
	}

}
