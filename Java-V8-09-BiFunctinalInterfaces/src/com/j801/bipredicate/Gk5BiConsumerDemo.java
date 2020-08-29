package com.j801.bipredicate;

import java.util.function.BiConsumer;

public class Gk5BiConsumerDemo {
	// Accepts two string and do the concatenation
	public static void main(String[] args) {

		BiConsumer<String, String> theBiConsumer = (str1, str2) -> System.out
				.println("The Concatenated String is " + str1 + str2);

		theBiConsumer.accept("Gokul", "Technologies");
		theBiConsumer.accept("Gk", "Tech");
		

	}

}
