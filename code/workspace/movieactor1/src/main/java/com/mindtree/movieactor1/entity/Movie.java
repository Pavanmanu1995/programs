package com.mindtree.movieactor1.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long movieId;
	private String movieName;
	private double budget;

	@ManyToMany(fetch = FetchType.LAZY,cascade = { CascadeType.PERSIST,CascadeType.MERGE},mappedBy = "movie")
	@JsonIgnore
	private List<Actor> actor;

	public Movie() {
		super();
	}

	public Movie(String movieName, double budget, List<Actor> actor) {
		super();
		this.movieName = movieName;
		this.budget = budget;
		this.actor = actor;
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public List<Actor> getActor() {
		return actor;
	}

	public void setActor(List<Actor> actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", budget=" + budget + ", actor=" + actor
				+ "]";
	}

}
