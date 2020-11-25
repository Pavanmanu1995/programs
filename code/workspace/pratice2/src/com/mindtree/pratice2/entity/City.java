package com.mindtree.pratice2.entity;

public class City implements Comparable<City>{
	
	private int cityId;
	private String cityName;
	public City() {
		super();
	}
	public City(int cityId, String cityName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + "]";
	}
	@Override
	public int compareTo(City c) {
		// TODO Auto-generated method stub
		return cityName.compareTo(c.getCityName());
	}
	

}
