package com.j802.ConstructorReference;

public class ConstructorReference {

	public static void main(String[] args) {
		// 1. Lambda Apprach
		SampleInterface lambda = () -> new Sample();

		Sample lambaObj = lambda.get();
		System.out.println("Lambda Approach " + lambaObj);

		System.out.println();

		// 2. Constructor Reference Object.
		SampleInterface constructorRef = Sample::new;
		Sample mthdRef = constructorRef.get();
		System.out.println("Constructor Reference Approach " + mthdRef);
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