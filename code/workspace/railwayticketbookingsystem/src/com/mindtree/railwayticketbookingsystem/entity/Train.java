package com.mindtree.railwayticketbookingsystem.entity;

public class Train {
	private int trainId;
	//private int userId;
	private String trainName;
	private String source;
	private String destination;
	private float distance;
	public Train() {
		super();
	}
	public Train(int trainId, String trainName, String source, String destination, float distance) {
		super();
		this.trainId = trainId;
		//this.userId = userId;
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
//	public int getUserId() {
//		return userId;
//	}
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}
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
	public void setDistance(int distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "Train [trainId=" + trainId + ", userId=" + ", trainName=" + trainName + ", source=" + source
				+ ", destination=" + destination + ", distance=" + distance + "]";
	}
	

}
