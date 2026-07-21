package com.kodewala.set3;

import java.util.HashSet;
import java.util.Iterator;

public class Driver6 {

    public static void main(String[] args) {

        Movie m1 = new Movie(1, "Bahubali");
        Movie m2 = new Movie(2, "KGF");
        Movie m3 = new Movie(3, "Pushpa");
        Movie m4 = new Movie(4, "RRR");
        Movie m5 = new Movie(1, "Bahubali");
        Movie m6 = new Movie(5, "KGF");

        HashSet<Movie> movieSet = new HashSet<Movie>();

        movieSet.add(m1);
        movieSet.add(m2);
        movieSet.add(m3);
        movieSet.add(m4);
        movieSet.add(m5);
        movieSet.add(m6);

        System.out.println(movieSet);

        System.out.println("------ For Each Loop ------");

        for (Movie movie : movieSet) {
            System.out.println(movie.movieName);
        }

        System.out.println("------ Iterator ------");

        Iterator<Movie> itr = movieSet.iterator();

        while (itr.hasNext()) {
            Movie movie = itr.next();
            System.out.println(movie.movieName);
        }
    }
}