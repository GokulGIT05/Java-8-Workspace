package com.J803.consumerchaining;

import java.util.function.Consumer;

public class Gk1ConsumerChainingDemo {

	public static void main(String[] args) {

		Consumer<Movie> c1 = mve -> System.out.println("The Movie name is " + mve.name);
		Consumer<Movie> c2 = mve -> System.out.println("The Movie Result is " + mve.result);
		Consumer<Movie> c3 = mve -> System.out.println("The Movie information is storing in database");

		Movie theMovie = new Movie("Bahubali", "Hit");

		// Consumer Chaining
		Consumer<Movie> consumerChain = c1.andThen(c2).andThen(c3);
		// c1 will execute first and c2 will execute second and c3 will execute.

		consumerChain.accept(theMovie);
	}
}
