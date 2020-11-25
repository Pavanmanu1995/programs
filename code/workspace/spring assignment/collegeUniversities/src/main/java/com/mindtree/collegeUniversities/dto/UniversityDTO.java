package com.mindtree.collegeUniversities.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.validation.constraints.NotNull;

import com.mindtree.collegeUniversities.entity.College;

public class UniversityDTO implements Comparable<UniversityDTO>, Serializable {
	private int universityId;
	
	@NotNull(message="university name cannot be empty")
	private String universityName;
	
	
	private int totalColleges;
	
	private List<College> collegeList;

	public UniversityDTO() {
	}
	
	public UniversityDTO(int universityId, @NotNull(message = "university name cannot be empty") String universityName,
			int totalColleges, List<College> collegeList) {
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

	public List<College> getCollegeList() {
		return collegeList;
	}

	public void setCollegeList(List<College> collegeList) {
		this.collegeList = collegeList;
	}

	@Override
	public String toString() {
		return "UniversityDTO [universityId=" + universityId + ", universityName=" + universityName + ", totalColleges="
				+ totalColleges + ", collegeList=" + collegeList + "]";
	}

	@Override
	public int compareTo(UniversityDTO o) {
		return this.getUniversityId() - o.getUniversityId();
	}
	
	

}
