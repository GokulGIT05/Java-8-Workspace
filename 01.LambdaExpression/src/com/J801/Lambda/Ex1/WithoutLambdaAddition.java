package com.J801.Lambda.Ex1;

public class WithoutLambdaAddition {

	public static void main(String[] args) {
		FuntionalInterfaceEx fex= new additionTest();
		fex.add(10, 20);
		System.out.println("End Of Program");
	}

}

interface FuntionalInterfaceEx {
	public int add(int a, int b);
}

class additionTest implements FuntionalInterfaceEx {

	@Override
	public int add(int a, int b) {
		int c= a+b;
		System.out.println("The sum of two numbers: "+c);
		return a + b;

	}
}