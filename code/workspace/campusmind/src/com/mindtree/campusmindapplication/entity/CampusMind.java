package com.mindtree.campusmindapplication.entity;

public class CampusMind {
	private int campusMindID;

	private String campusMindName;

	private int age;

	private String stateName;

	private String campusMindTrack;

	public CampusMind() {
		super();
	}

	public CampusMind(int campusMindID, String campusMindName, int age, String stateName, String campusMindTrack) {
		super();
		this.campusMindID = campusMindID;
		this.campusMindName = campusMindName;
		this.age = age;
		this.stateName = stateName;
		this.campusMindTrack = campusMindTrack;
	}

	public int getCampusMindID() {
		return campusMindID;
	}

	public void setCampusMindID(int campusMindID) {
		this.campusMindID = campusMindID;
	}

	public String getCampusMindName() {
		return campusMindName;
	}

	public void setCampusMindName(String campusMindName) {
		this.campusMindName = campusMindName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCampusMindTrack() {
		return campusMindTrack;
	}

	public void setCampusMindTrack(String campusMindTrack) {
		this.campusMindTrack = campusMindTrack;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + campusMindID;
		result = prime * result + ((campusMindName == null) ? 0 : campusMindName.hashCode());
		result = prime * result + ((campusMindTrack == null) ? 0 : campusMindTrack.hashCode());
		result = prime * result + ((stateName == null) ? 0 : stateName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CampusMind other = (CampusMind) obj;
		if (age != other.age)
			return false;
		if (campusMindID != other.campusMindID)
			return false;
		if (campusMindName == null) {
			if (other.campusMindName != null)
				return false;
		} else if (!campusMindName.equals(other.campusMindName))
			return false;
		if (campusMindTrack == null) {
			if (other.campusMindTrack != null)
				return false;
		} else if (!campusMindTrack.equals(other.campusMindTrack))
			return false;
		if (stateName == null) {
			if (other.stateName != null)
				return false;
		} else if (!stateName.equals(other.stateName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "campusMindID=" + campusMindID + "\n campusMindName=" + campusMindName + "\n age=" + age
				+ "\n stateName=" + stateName + "\n campusMindTrack=" + campusMindTrack;
	}

}
