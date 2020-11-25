package com.mindtree.movieactor1.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long actorId;
	private String actorName;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
  	@JoinTable(joinColumns = { @JoinColumn(name = "actor_Id") }, inverseJoinColumns = {
			@JoinColumn(name = "movie_Id") })
	@JsonIgnore
	List<Movie> movie;

	public Actor() {
		super();
	}

	public Actor(String actorName, List<Movie> movie) {
		super();
		this.actorName = actorName;
		this.movie = movie;
	}

	public long getActorId() {
		return actorId;
	}

	public void setActorId(long actorId) {
		this.actorId = actorId;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public List<Movie> getMovie() {
		return movie;
	}

	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", actorName=" + actorName + ", movie=" + movie + "]";
	}

}
