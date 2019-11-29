package com.j801.MethodReference;

public class MethodReferDemo {

	public static void main(String[] args) {

		Interf theInterf = MethodReferDemo::m2;
		theInterf.m1();

	}

	public static void m2() {
		System.out.println("Inside Static m2 method");
	}
}

interface Interf {
	public void m1();

}
