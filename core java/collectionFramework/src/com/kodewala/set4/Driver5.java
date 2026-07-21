package com.kodewala.set4;

import java.util.TreeSet;

public class Driver5 {
	public static void main(String[] args) {
		
		TreeSet<Movie> movieSet = new TreeSet<Movie>(new MovieComparator());
		
		movieSet.add(new Movie("Dangal"));
		movieSet.add(new Movie("akjfgh"));
		
		for(Movie m : movieSet) {
			System.out.println(m.name);
		}
	}
}
