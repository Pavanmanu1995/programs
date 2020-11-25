package com.mindtree.foodBallMatch.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Matches {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int matchId;
	private Date matchDate;
	private String teamName1;
	private String teamName2;
	private int firstTeamScore;
	private int secondTeamScore;
	
	@OneToOne
	private Teams team1;
	@OneToOne
	private Teams team2;
	public Matches() {
		super();
	}
	public Matches(int matchId, Date matchDate, String teamName1, String teamName2, int firstTeamScore,
			int secondTeamScore, Teams team1, Teams team2) {
		super();
		this.matchId = matchId;
		this.matchDate = matchDate;
		this.teamName1 = teamName1;
		this.teamName2 = teamName2;
		this.firstTeamScore = firstTeamScore;
		this.secondTeamScore = secondTeamScore;
		this.team1 = team1;
		this.team2 = team2;
	}
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public Date getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}
	public String getTeamName1() {
		return teamName1;
	}
	public void setTeamName1(String teamName1) {
		this.teamName1 = teamName1;
	}
	public String getTeamName2() {
		return teamName2;
	}
	public void setTeamName2(String teamName2) {
		this.teamName2 = teamName2;
	}
	public int getFirstTeamScore() {
		return firstTeamScore;
	}
	public void setFirstTeamScore(int firstTeamScore) {
		this.firstTeamScore = firstTeamScore;
	}
	public int getSecondTeamScore() {
		return secondTeamScore;
	}
	public void setSecondTeamScore(int secondTeamScore) {
		this.secondTeamScore = secondTeamScore;
	}
	public Teams getTeam1() {
		return team1;
	}
	public void setTeam1(Teams team1) {
		this.team1 = team1;
	}
	public Teams getTeam2() {
		return team2;
	}
	public void setTeam2(Teams team2) {
		this.team2 = team2;
	}
}
