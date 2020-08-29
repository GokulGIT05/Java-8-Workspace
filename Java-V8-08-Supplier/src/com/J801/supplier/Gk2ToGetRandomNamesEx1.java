package com.J801.supplier;

import java.util.function.Supplier;

public class Gk2ToGetRandomNamesEx1 {

	// Program to get Random Name by using Supplier
	public static void main(String[] args) {
		
		Supplier<String> theSupplier = () -> {
			
			String[] names = {"Gk1","Gk2","Gk3"};
			int x = (int) (Math.random()*3);
			return names[x];
				
		};

		System.out.println("The Random name is: "+theSupplier.get());
		System.out.println("The Random name is: "+theSupplier.get());
		System.out.println("The Random name is: "+theSupplier.get());
		System.out.println("The Random name is: "+theSupplier.get());
		
	}

}
