package com.J801.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

import com.J802.Consumer.dto.Movie;

public class Gk2Example1 {

	public static void main(String[] args) {

		ArrayList<Movie> theMovies = new ArrayList<Movie>();

		populateMovies(theMovies);

		Consumer<Movie> theConsumer = eachMovie -> {
			System.out.println("Movie Name: " + eachMovie.movieName);
			System.out.println("Hero: " + eachMovie.hero);
			System.out.println("Heroine: " + eachMovie.heroine);
			System.out.println("*******************************");

		};

		for (Movie eachMovie : theMovies) {
			theConsumer.accept(eachMovie);
		}

	}

	private static void populateMovies(ArrayList<Movie> theMovies) {
		theMovies.add(new Movie("2.0", "Rajini", "Amy"));
		theMovies.add(new Movie("Bahubali", "Prabhas", "Anuska"));
		theMovies.add(new Movie("Harry Potter", "Harry", "Emmy Jackson"));
	}

}
