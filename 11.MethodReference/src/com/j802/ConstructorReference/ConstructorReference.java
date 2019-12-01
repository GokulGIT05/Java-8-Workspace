package com.j802.ConstructorReference;

import java.util.function.Supplier;

public class ConstructorReference {

	public static void main(String[] args) {
		// 1. Lambda Approach
		System.out.println("Using Lambda");
		SampleInterface lambda = () -> new Sample();
		Sample lambaObj = lambda.get();
		System.out.println("Lambda Approach " + lambaObj);
		System.out.println("*********************************************");

		// 2. Constructor Reference Object.
		System.out.println("Constructor Reference Object.");
		SampleInterface constructorRef = Sample::new;
		Sample mthdRef = constructorRef.get();
		System.out.println("Constructor Reference Approach " + mthdRef);
		System.out.println("*********************************************");

		// 3. Using Existing Functional Interfaces
		Supplier<Sample> theRef = Sample::new;
		Sample theSampe = theRef.get();
		System.out.println(theSampe);
		
	}

}

class Sample {
	Sample() {
		System.out.println("Inside  sample constructor");
	}

	@Override
	public String toString() {
		return "Sample []";
	}

}

interface SampleInterface {
	public Sample get();
}