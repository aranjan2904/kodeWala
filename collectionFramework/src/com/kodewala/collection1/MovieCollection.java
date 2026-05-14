package com.kodewala.collection1;

import java.util.ArrayList;

public class MovieCollection {
	public static void main(String[] args) {
		
		ArrayList<String> movieList = new ArrayList<String>();
		
		movieList.add("Bahubali");
		movieList.add("Dangal");
		movieList.add("War");
		movieList.add("Sultan");
		
		//print movie name ending with 'a'
		for(int i = 0; i < movieList.size(); i++) {
			
			String currentMovie = movieList.get(i);
			
			if(currentMovie.toLowerCase().endsWith("i")) {
				System.out.println(currentMovie);
			}
		}
	}
}
