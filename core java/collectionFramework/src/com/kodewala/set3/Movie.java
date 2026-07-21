package com.kodewala.set3;

public class Movie {

    int movieId;
    String movieName;

    public Movie(int movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }

    @Override
    public boolean equals(Object obj) {
        Movie m = (Movie) obj;
        return this.movieId == m.movieId;
    }

    @Override
    public int hashCode() {
        return this.movieId;
    }

    @Override
    public String toString() {
        return movieId + " " + movieName;
    }
}