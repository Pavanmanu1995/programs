package com.mindtree.collegeUniversities.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "university")
public class University implements Comparable<University>,Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "university_id")
	private int universityId;
	
	@Column(name = "university_name")
	private String universityName;
	
	@Column(name = "total_colleges")
	private int totalColleges;
	
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL,mappedBy="university")
	private List<College> collegeList;

	public University() {
	}

	public University(int universityId, String universityName, int totalColleges, List<College> collegeList) {
		super();
		this.universityId = universityId;
		this.universityName = universityName;
		this.totalColleges = totalColleges;
		this.collegeList = collegeList;
	}
	
	public University(int universityId, String universityName, int totalColleges) {
		super();
		this.universityId = universityId;
		this.universityName = universityName;
		this.totalColleges = totalColleges;
	}

	public int getUniversityId() {
		return universityId;
	}

	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public int getTotalColleges() {
		return totalColleges;
	}

	public void setTotalColleges(int totalColleges) {
		this.totalColleges = totalColleges;
	}

	public List<College> getCollegeList() {
		return collegeList;
	}

	public void setCollegeList(List<College> collegeList) {
		this.collegeList = collegeList;
	}

	@Override
	public int compareTo(University u) {
		
		return u.getUniversityId()-this.getUniversityId();
	}
}
