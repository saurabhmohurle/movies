package com.movie.movies.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends JpaRepository<MoviesEntity, Integer> {
	public List<MoviesEntity> findMoviesByMovieName(String moviename);
	public String deleteMovieByMovieName(String moviename);
}
