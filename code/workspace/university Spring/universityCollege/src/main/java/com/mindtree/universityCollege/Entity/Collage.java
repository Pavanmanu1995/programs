package com.mindtree.universityCollege.Entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.criteria.Fetch;

@Entity
@Table
public class Collage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int collageId;
	private String collegeName;
	private int totalStudent;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uId")
	private University university;

	public Collage() {
		super();
	}

	public Collage(int collageId, String collegeName, int totalStudent, University university) {
		super();
		this.collageId = collageId;
		this.collegeName = collegeName;
		this.totalStudent = totalStudent;
		this.university = university;
	}

	public int getCollageId() {
		return collageId;
	}

	public void setCollageId(int collageId) {
		this.collageId = collageId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getTotalStudent() {
		return totalStudent;
	}

	public void setTotalStudent(int totalStudent) {
		this.totalStudent = totalStudent;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "Collage [collageId=" + collageId + ", collegeName=" + collegeName + ", totalStudent=" + totalStudent
				+ ", university=" + university + "]";
	}
}

	