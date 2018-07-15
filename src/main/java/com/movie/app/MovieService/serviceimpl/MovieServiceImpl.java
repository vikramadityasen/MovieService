package com.movie.app.MovieService.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.movie.app.MovieService.model.MovieDetails;
import com.movie.app.MovieService.repository.MovieRepository;
import com.movie.app.MovieService.service.MovieService;

import javassist.NotFoundException;

@Service
public class MovieServiceImpl implements MovieService {

	private static final Logger logger = LoggerFactory.getLogger(MovieServiceImpl.class);

	@Autowired
	MovieRepository movieRepository;

	@Override
	public List<MovieDetails> getAllMovieDetails() {
		return movieRepository.findAll();
	}

	@Override
	public MovieDetails getMovieDetail(Integer movieId) {
		Optional<MovieDetails> movieDetail = movieRepository.findById(movieId);
		if (!movieDetail.isPresent()) {
			try {
				throw new NotFoundException("movieId {}" + movieId);
			} catch (NotFoundException e) {
				logger.debug("Movie details {}" + e);
			}
		}
		return movieDetail.get();
	}

	@Override
	public MovieDetails saveMovieDetails(MovieDetails movieDetails) {
		return movieRepository.save(movieDetails);
	}

	@Override
	public ResponseEntity<Object> updateMovieDetails(MovieDetails movieDetails, Integer movieId) {
		Optional<MovieDetails> movieDetail = movieRepository.findById(movieId);
		if (!movieDetail.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		movieDetails.setMovieId(movieId);
		movieRepository.save(movieDetails);
		return ResponseEntity.ok(movieDetail);
	}

}
