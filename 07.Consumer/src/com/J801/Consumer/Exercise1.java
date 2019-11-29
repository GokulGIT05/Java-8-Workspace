package com.J801.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Exercise1 {

	public static void main(String[] args) {

		ArrayList<Movie> theMovies = new ArrayList<Movie>();

		populateMovies(theMovies);
		
		Consumer<Movie> theConsumer= mve -> {
			System.out.println("Movie Name: "+mve.movieName );
			System.out.println("Hero: "+mve.hero );
			System.out.println("Heroine: "+mve.heroine );
			System.out.println();
	
		};
		
		for(Movie mveList: theMovies) {
			theConsumer.accept(mveList);
		}
		
		

	}

	private static void populateMovies(ArrayList<Movie> theMovies) {
		// TODO Auto-generated method stub
		theMovies.add(new Movie("2.0", "Rajini", "Amy"));
		theMovies.add(new Movie("Bahubali", "Prabhas", "Anuska"));
		theMovies.add(new Movie("Harry Potter", "Harry", "Emmy Jackson"));

	}

}
