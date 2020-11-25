package com.mindtree.collegeUniversity.dto;

import javax.validation.constraints.NotNull;

import com.mindtree.collegeUniversity.entity.University;

public class CollegeDTO {
	private int collegeId;
	
	@NotNull(message="college name cannot be empty")
	private String collegeName;
	
	@NotNull(message="total students cannot be empty")
	private int totalStudents;
	private University university;
	public CollegeDTO() {
		super();
	}
	public CollegeDTO(int collegeId, @NotNull(message = "college name cannot be empty") String collegeName,
			int totalStudents, University university) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.totalStudents = totalStudents;
		this.university = university;
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getTotalStudents() {
		return totalStudents;
	}
	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	@Override
	public String toString() {
		return "CollegeDTO [collegeId=" + collegeId + ", collegeName=" + collegeName + ", totalStudents="
				+ totalStudents + ", university=" + university + "]";
	}
	
	

}
