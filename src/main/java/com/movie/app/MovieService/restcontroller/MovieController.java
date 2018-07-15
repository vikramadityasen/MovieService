package com.movie.app.MovieService.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.app.MovieService.model.MovieDetails;
import com.movie.app.MovieService.service.MovieService;

@RequestMapping("/user")
@RestController
public class MovieController {

	@Autowired
	MovieService movieService;

	@GetMapping("/getAllMovieDetails")
	public List<MovieDetails> getAllMovieDetails() {
		return movieService.getAllMovieDetails();
	}

	@GetMapping("/getMovieDetail/{movieId}")
	public MovieDetails getMovieDetail(@PathVariable Integer movieId) {
		return movieService.getMovieDetail(movieId);
	}

	@PostMapping("/saveMovieDetails")
	public MovieDetails saveMovieDetails(@RequestBody MovieDetails movieDetails) {
		return movieService.saveMovieDetails(movieDetails);
	}

	@PutMapping("/updateMovieDetails/{movieId}")
	public ResponseEntity<Object> updateMovieDetails(@RequestBody MovieDetails movieDetails,
			@PathVariable Integer movieId) {
		return movieService.updateMovieDetails(movieDetails, movieId);
	}
}
