package com.J801.Lambda;

public class WithLambda {

	public static void main(String[] args) {
		
		// In here, we no need any class to implement the interface to provide implementation
		
		InterfLambda interfLambda = (lambdaLocalStr) -> System.out.println("Inside Lambda Expression : "+lambdaLocalStr);
		// In method parameter, am passing the value.
		interfLambda.m1("Gokul");

	}

}

interface InterfLambda {
	public abstract void m1(String str);
}