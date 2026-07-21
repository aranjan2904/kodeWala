package com.kodewala.collection2;

import java.util.ArrayList;

public class MovieCollection {
	public static void main(String[] args) {
		
		Movie movie1 = new Movie("Pushpa", "Action", "Netflix", "2021");
		Movie movie2 = new Movie("Jawan", "Action", "Netflix", "2023");
		Movie movie3 = new Movie("Dangal", "Sports", "Disney+ Hotstar", "2016");
		Movie movie4 = new Movie("3 Idiots", "Comedy", "Amazon Prime", "2009");
		Movie movie5 = new Movie("Animal", "Action", "Netflix", "2023");
		Movie movie6 = new Movie("Bahubali", "Fantasy", "Disney+ Hotstar", "2015");
		Movie movie7 = new Movie("War", "Thriller", "Amazon Prime", "2019");
		Movie movie8 = new Movie("Pathaan", "Spy", "Amazon Prime", "2023");
		Movie movie9 = new Movie("Drishyam", "Crime", "Disney+ Hotstar", "2015");
		Movie movie10 = new Movie("KGF", "Action", "Netflix", "2018");
		Movie movie11 = new Movie("Shershaah", "Biography", "Amazon Prime", "2021");
		Movie movie12 = new Movie("Chhichhore", "Comedy", "Disney+ Hotstar", "2019");
		Movie movie13 = new Movie("Raazi", "Thriller", "Amazon Prime", "2018");
		Movie movie14 = new Movie("Sultan", "Sports", "Netflix", "2016");
		Movie movie15 = new Movie("PK", "Comedy", "Sony LIV", "2014");
		
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		
		movieList.add(movie1);
		movieList.add(movie2);
		movieList.add(movie3);
		movieList.add(movie4);
		movieList.add(movie5);
		movieList.add(movie6);
		movieList.add(movie7);
		movieList.add(movie8);
		movieList.add(movie9);
		movieList.add(movie10);
		movieList.add(movie11);
		movieList.add(movie12);
		movieList.add(movie13);
		movieList.add(movie14);
		movieList.add(movie15);
		
		int count =0;
		for(int i=0; i < movieList.size(); i++) {
			Movie currentMovie = movieList.get(i);
		
			if(currentMovie.getGenra().equals("Action")) {
				System.out.println(currentMovie.getMovieName());
				count = count +1;
			}
		}
		System.out.println("Total Action movie is: "+ count);
	}
}
