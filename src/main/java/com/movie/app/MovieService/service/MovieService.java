package com.movie.app.MovieService.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.movie.app.MovieService.model.MovieDetails;

public interface MovieService {

	List<MovieDetails> getAllMovieDetails();

	MovieDetails getMovieDetail(Integer movieId);

	MovieDetails saveMovieDetails(MovieDetails movieDetails);

	ResponseEntity<Object> updateMovieDetails(MovieDetails movieDetails, Integer movieId);

}
