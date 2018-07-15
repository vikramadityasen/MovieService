package com.movie.app.MovieService.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MovieDetails {

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer movieId;
	@Column
	private String movieName;
	@Column
	private String directorName;
	@Column
	private String productionHouse;
	@Column
	private String releaseDate;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<CastDetails> castList = new LinkedList<>();

	public MovieDetails() {
		super();
	}

	public MovieDetails(Integer movieId, String movieName, String directorName, String productionHouse,
			String releaseDate, List<CastDetails> castList) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.directorName = directorName;
		this.productionHouse = productionHouse;
		this.releaseDate = releaseDate;
		this.castList = castList;
	}

	@Override
	public String toString() {
		return "MovieDetails [movieId=" + movieId + ", movieName=" + movieName + ", directorName=" + directorName
				+ ", productionHouse=" + productionHouse + ", releaseDate=" + releaseDate + ", castList=" + castList
				+ "]";
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getProductionHouse() {
		return productionHouse;
	}

	public void setProductionHouse(String productionHouse) {
		this.productionHouse = productionHouse;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public List<CastDetails> getCastList() {
		return castList;
	}

	public void setCastList(List<CastDetails> castList) {
		this.castList = castList;
	}

}
