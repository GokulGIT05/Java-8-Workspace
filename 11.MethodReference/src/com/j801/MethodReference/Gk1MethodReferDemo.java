package com.j801.MethodReference;

public class Gk1MethodReferDemo {

	public static void main(String[] args) {

		Interf theInterf = Gk1MethodReferDemo::m2; // alternate to lambda expression
		theInterf.m1();

		Interf lambdaObj = () -> System.out.println("Using Lambda");
		lambdaObj.m1();

	}

	// Both interface and method reference should have same arugement type.
	public static void m2() {
		System.out.println("Inside Static m2 method");
	}
}

@FunctionalInterface
interface Interf {
	public void m1();

}
