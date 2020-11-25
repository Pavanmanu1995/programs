package com.mindtree.foodBallMatch.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teams {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teamId;
	private String teamName;
	private String teamCity;
	public Teams() {
		super();
	}
	public Teams(String teamName, String teamCity) {
		super();
		//this.teamId = teamId;
		this.teamName = teamName;
		this.teamCity = teamCity;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamCity() {
		return teamCity;
	}
	public void setTeamCity(String teamCity) {
		this.teamCity = teamCity;
	}
	
	
	
	
	
	

}
