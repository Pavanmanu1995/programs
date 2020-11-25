package com.mindtree.universityCollege.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "uId")
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uId;
	private String uName;
	private int totalCollage;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "university")
	private List<Collage> collageList;

	public University() {
		super();
	}

	public University(String uName, int totalCollage, List<Collage> collageList) {
		super();
		// this.uId = uId;
		this.uName = uName;
		this.totalCollage = totalCollage;
		this.collageList = collageList;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public int getTotalCollage() {
		return totalCollage;
	}

	public void setTotalCollage(int totalCollage) {
		this.totalCollage = totalCollage;
	}

	public List<Collage> getCollageList() {
		return collageList;
	}

	public void setCollageList(List<Collage> collageList) {
		this.collageList = collageList;
	}

	@Override
	public String toString() {
		return "University [uId=" + uId + ", uName=" + uName + ", totalCollage=" + totalCollage + ", collageList="
				+ collageList + "]";
	}

}
