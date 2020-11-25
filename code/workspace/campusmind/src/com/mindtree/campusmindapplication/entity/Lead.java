package com.mindtree.campusmindapplication.entity;

public class Lead {
	
	private int leadID;
	
	private String leadName;
	
	private int campusMindID;
	
	
	public Lead() {

	}


	public Lead(int leadID, String leadName, int campusMindID) {
		super();
		this.leadID = leadID;
		this.leadName = leadName;
		this.campusMindID = campusMindID;
	}


	public int getLeadID() {
		return leadID;
	}


	public void setLeadID(int leadID) {
		this.leadID = leadID;
	}


	public String getLeadName() {
		return leadName;
	}


	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}


	public int getCampusMindID() {
		return campusMindID;
	}


	public void setCampusMindID(int campusMindID) {
		this.campusMindID = campusMindID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + campusMindID;
		result = prime * result + leadID;
		result = prime * result + ((leadName == null) ? 0 : leadName.hashCode());
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
		Lead other = (Lead) obj;
		if (campusMindID != other.campusMindID)
			return false;
		if (leadID != other.leadID)
			return false;
		if (leadName == null) {
			if (other.leadName != null)
				return false;
		} else if (!leadName.equals(other.leadName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Lead [leadID=" + leadID + ", leadName=" + leadName + ", campusMindID=" + campusMindID + "]";
	}
	
	
	
}
