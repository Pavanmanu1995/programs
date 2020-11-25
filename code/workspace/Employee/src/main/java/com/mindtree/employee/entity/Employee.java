package com.mindtree.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "Id")
		private int id;

		@Column(name = "Name")
		private String name;

		@Column(name = "Salary")
		private double salary;

		@Column(name = "Mobile_Number")
		private String mobileNumber;

		@Column(name = "Designation")
		private String designation;
		

		public Employee() {

		}


		public Employee(int id, String name, double salary, String mobileNumber, String designation) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.mobileNumber = mobileNumber;
			this.designation = designation;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public double getSalary() {
			return salary;
		}


		public void setSalary(double salary) {
			this.salary = salary;
		}


		public String getMobileNumber() {
			return mobileNumber;
		}


		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}


		public String getDesignation() {
			return designation;
		}


		public void setDesignation(String designation) {
			this.designation = designation;
		}
		
		

	
		
	}

