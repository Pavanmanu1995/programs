package com.mindtree.employee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.employee.entity.Employee;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Integer> {

	Optional<Employee> findByName(String name);

}
