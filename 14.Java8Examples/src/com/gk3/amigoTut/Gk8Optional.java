package com.gk3.amigoTut;

import java.util.Optional;

public class Gk8Optional {

	public static void main(String[] args) {
		
	//	Optional<String> helloRef = Optional.of(null);   // throws NPE
	//	Optional<String> helloRef = Optional.ofNullable("hello"); // Null Safe
		Optional<String> helloRef = Optional.ofNullable(null);
		
		System.out.println(helloRef);
		System.out.println(helloRef.isPresent());
		
		String orElse = helloRef.orElse("World");
		System.out.println(orElse);
		
		String orElseMap = helloRef.map(String::toUpperCase)
				.orElse("world");
		
		System.out.println(orElseMap);
		
		// 
		String orElseGetFromDB = helloRef.orElseGet(() -> {
			// .. we can perform extra computation like getting some value from database etc.
			return "WorldFromDb";
		} );
		System.out.println(orElseGetFromDB);
		
		helloRef.ifPresent(word -> System.out.println("ifPresent: "+word));
		
		// ifPresentOrElse is not present in Java 8
		
	}

}
