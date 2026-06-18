package com.kodewala.set4;

public class Movie implements Comparable<Movie>{
	String name;
	
	public Movie(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Movie m) { // -ve or Zero or +ve
		return(this.name.compareTo(m.name));
	}
	
}