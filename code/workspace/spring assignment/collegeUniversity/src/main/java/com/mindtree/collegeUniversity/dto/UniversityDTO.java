package com.mindtree.collegeUniversity.dto;

import java.util.Set;

import javax.validation.constraints.NotNull;

import com.mindtree.collegeUniversity.entity.College;

public class UniversityDTO {
	private int universityId;
	
	@NotNull(message="university name cannot be empty")
	private String universityName;
	
	@NotNull(message="total colleges cannot be empty")
	private int totalColleges;
	
	private Set<College> collegeList;

	public UniversityDTO() {
		super();
	}

	public UniversityDTO(int universityId, @NotNull(message = "university name cannot be empty") String universityName,
			@NotNull(message = "total colleges cannot be empty") int totalColleges, Set<College> collegeList) {
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
		return "UniversityDTO [universityId=" + universityId + ", universityName=" + universityName + ", totalColleges="
				+ totalColleges + ", collegeList=" + collegeList + "]";
	}
	
	

}
