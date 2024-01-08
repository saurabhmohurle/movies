package com.movie.movies.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.movies.entity.MoviesEntity;
import com.movie.movies.entity.MoviesRepository;

@Service
public class MoviesService {
	private static final Logger logger = LoggerFactory.getLogger(MoviesService.class);
	
	@Autowired
	MoviesRepository repository;
	
	//RestTemplate template;
	String response;
	
	public String addMovies(MoviesEntity entity) {
		repository.save(entity);
		response = "Movie added successfully";
		logger.info(response);
		// TODO Auto-generated method stub
		return response;
	}
	public String updateMovieDetails(MoviesEntity entity) {
		// TODO Auto-generated method stub
		repository.save(entity);
		response = "Movie details updated successfully";
		logger.info(response);
		// TODO Auto-generated method stub
		return response;
	}
	public List<MoviesEntity> getMovies() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	public List<MoviesEntity> getMoviesByName(String movieName) {
		// TODO Auto-generated method stub
		return repository.findMoviesByMovieName(movieName);
	}
	public String deleteMovieByName(String movieName) {
		// TODO Auto-generated method stub
		try {
			repository.deleteMovieByMovieName(movieName);
			response = "Movie deleted successfully";
			logger.info(response);
		} catch (Exception e) {
			// TODO: handle exception
			response = "Innvalid Name ";
			logger.error(response);
		}
		return response;
	}
	public String deleteMovieById(int id) {
		// TODO Auto-generated method stub
		try {
			repository.deleteById(id);
			response = "Movie deleted successfully";
			logger.info(response);
		} catch (Exception e) {
			// TODO: handle exception
			response = "Invalid id ";
			logger.error(response);
		}
		return response;
	}
	

}
