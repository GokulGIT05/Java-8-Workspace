package com.J801.Lambda.FICases;

public class Gk1DiffernetCasesOfFI {

	public static void main(String[] args) {
		
		FunctionalInterfaceDemo ref1 = () -> System.out.println("Inside Method");
		ref1.m1();
		
	}

}

@FunctionalInterface
interface FunctionalInterfaceDemo{
	
	public void m1();
	
//	public void m2();
}