package com.mindtree.collegeUniversities.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "college")
public class College implements Comparable<College>,Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "college_id")
	private int collegeId;
	
	@Column(name = "college_name")
	private String collegeName;
	
	@Column(name = "total_students")
	private int totalStudents;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	private University university;

	public College() {
	}
	
	public College(int collegeId, String collegeName, int totalStudents) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.totalStudents = totalStudents;
	}

	public College(int collegeId, String collegeName, int totalStudents, University university) {
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
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", totalStudents=" + totalStudents
				+ ", university=" + university + "]";
	}

	@Override
	public int compareTo(College o) {
		return o.getTotalStudents()-this.getTotalStudents();
	}
	
	
	

}
