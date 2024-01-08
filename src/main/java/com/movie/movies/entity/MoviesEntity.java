package com.movie.movies.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Movies")
public class MoviesEntity {
	@Id
	private int id;
	private String movieName;
	private String date;
	private String time;
	private String theatername;
	private double price;
	/**
	 * 
	 */
	public MoviesEntity() {
		super();
	}
	/**
	 * @param id
	 * @param moviename
	 * @param date
	 * @param time
	 * @param theatername
	 * @param price
	 */
	public MoviesEntity(int id, String movieName, String date, String time, String theatername, double price) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.date = date;
		this.time = time;
		this.theatername = theatername;
		this.price = price;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the moviename
	 */
	public String getMoviename() {
		return movieName;
	}
	/**
	 * @param moviename the moviename to set
	 */
	public void setMoviename(String movieName) {
		this.movieName = movieName;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * @return the theatername
	 */
	public String getTheatername() {
		return theatername;
	}
	/**
	 * @param theatername the theatername to set
	 */
	public void setTheatername(String theatername) {
		this.theatername = theatername;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MoviesEntity [id=" + id + ", moviename=" + movieName + ", date=" + date + ", time=" + time
				+ ", theatername=" + theatername + ", price=" + price + "]";
	}
	
}
