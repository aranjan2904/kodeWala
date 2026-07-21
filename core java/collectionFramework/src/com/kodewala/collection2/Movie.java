package com.kodewala.collection2;

public class Movie {
	String movieName;
	String releaseYear;
	String genra;
	String platform;
	
	public Movie(String movieName,String genra,String platform, String releaseYear) {
		this.movieName = movieName;
		this.releaseYear = releaseYear;
		this.genra = genra;
		this.platform = platform;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getGenra() {
		return genra;
	}

	public void setGenra(String genra) {
		this.genra = genra;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
	

}
