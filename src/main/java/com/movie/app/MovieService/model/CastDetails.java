package com.movie.app.MovieService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CastDetails {

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer castId;
	@Column
	private String name;
	@Column
	private String gender;
	@Column
	private Integer experience;
	@JsonIgnore
	@ManyToOne
	private MovieDetails movieDetails;

	public CastDetails() {
		super();
	}

	public CastDetails(Integer castId, String name, String gender, Integer experience, MovieDetails movieDetails) {
		super();
		this.castId = castId;
		this.name = name;
		this.gender = gender;
		this.experience = experience;
		this.movieDetails = movieDetails;
	}

	@Override
	public String toString() {
		return "CastDetails [castId=" + castId + ", name=" + name + ", gender=" + gender + ", experience=" + experience
				+ ", movieDetails=" + movieDetails + "]";
	}

	public Integer getCastId() {
		return castId;
	}

	public void setCastId(Integer castId) {
		this.castId = castId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public MovieDetails getMovieDetails() {
		return movieDetails;
	}

	public void setMovieDetails(MovieDetails movieDetails) {
		this.movieDetails = movieDetails;
	}

}
