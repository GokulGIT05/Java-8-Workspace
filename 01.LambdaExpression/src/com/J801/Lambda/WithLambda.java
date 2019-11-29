package com.J801.Lambda;

public class WithLambda {

	public static void main(String[] args) {
		InterfLambda interfLambda = () -> System.out.println("Inside Lambda Expression");
		interfLambda.m1();

	}

}

interface InterfLambda {
	public void m1();
}