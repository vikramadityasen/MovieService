package com.movie.app.MovieService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.app.MovieService.model.MovieDetails;

@Repository
public interface MovieRepository extends JpaRepository<MovieDetails, Integer> {

}
