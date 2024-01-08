package com.movie.movies.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movie.movies.entity.MoviesEntity;
import com.movie.movies.service.MoviesService;

@RestController
public class MoviesController {
	private static final Logger logger = LoggerFactory.getLogger(MoviesController.class);
	
	@Autowired
	MoviesService service;
	
	String response;
	
	@PostMapping("/addMovies")
	public String addMovies(@RequestBody MoviesEntity entity) {
		response = "Movie added successfully";
		logger.info(response);
		return service.addMovies(entity);
	}
	@PutMapping("/updateMovieDetails")
	public String updateMovieDetails(@RequestBody MoviesEntity entity) {
		response = "Movie details updated successfully";
		logger.info(response);
		return service.updateMovieDetails(entity);
	}
	@GetMapping("/getMovies")
	public List<MoviesEntity> getMovies(){
		return service.getMovies();
	}
	@GetMapping("getMoviesByName")
	public List<MoviesEntity> getMoviesByName(@RequestParam String moviename){
		return service.getMoviesByName(moviename);
	}
	@DeleteMapping("/deleteMovieByName")
	public String deleteMovieByName(@RequestParam String moviename) {
		response = "Movie deleted successfully";
		logger.info(response);
		return service.deleteMovieByName(moviename);
	}
	@DeleteMapping("/deleteMovieById")
	public String deleteMovieById(@RequestParam int id) {
		response = "Movie deleted successfully";
		logger.info(response);
		return service.deleteMovieById(id);
	}
}
