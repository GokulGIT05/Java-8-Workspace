package com.J803.staticDemo;

public class StaticDemo implements StaticInterf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo theTest = new StaticDemo();

		/*
		 * // Below two are wrong, We can call static methods only by interface name.
		 * theTest.m1(); StaticDemo.m1();
		 */

		StaticInterf.m1();

	}

}

interface StaticInterf {

	public static void m1() {
		System.out.println("Inside static method");
	}

}