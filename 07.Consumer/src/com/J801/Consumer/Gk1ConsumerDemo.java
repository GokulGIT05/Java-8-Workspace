package com.J801.Consumer;

import java.util.function.Consumer;

public class Gk1ConsumerDemo {

	public static void  main(String[] args) {
		
		Consumer<String> theConsumer = str -> System.out.println("Inside Consumer Lambda "+str);
		
		theConsumer.accept("Demo Program");
		
	}
}
