package com.mindtree.CollageUniversity.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class University {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int universityId;
	private String universityName;
	private int totalColleges;
	
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL,mappedBy="university")
	private Set<College> collegeList;

	public University() {
		super();
	}

	public University(int universityId, String universityName, int totalColleges, Set<College> collegeList) {
		super();
		this.universityId = universityId;
		this.universityName = universityName;
		this.totalColleges = totalColleges;
		this.collegeList = collegeList;
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

	public Set<College> getCollegeList() {
		return collegeList;
	}

	public void setCollegeList(Set<College> collegeList) {
		this.collegeList = collegeList;
	}

	@Override
	public String toString() {
		return "University [universityId=" + universityId + ", universityName=" + universityName + ", totalColleges="
				+ totalColleges + ", collegeList=" + collegeList + "]";
	}
	
	
	

}
