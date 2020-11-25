package com.mindtree.trainbookingsystem.entity;

public class Train {
	int trainId;
	String trainName;
	String source;
	String destination;
	float distance;
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Train(int trainId, String trainName, String source, String destination, float distance) {
		super();
		this.trainId = trainId;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
	}
	public int getTrainId() {
		return trainId;
	}
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + Float.floatToIntBits(distance);
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + trainId;
		result = prime * result + ((trainName == null) ? 0 : trainName.hashCode());
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
		Train other = (Train) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (Float.floatToIntBits(distance) != Float.floatToIntBits(other.distance))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (trainId != other.trainId)
			return false;
		if (trainName == null) {
			if (other.trainName != null)
				return false;
		} else if (!trainName.equals(other.trainName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Train [trainId=" + trainId + ", trainName=" + trainName + ", source=" + source + ", destination="
				+ destination + ", distance=" + distance + "]";
	}
	
	
}
