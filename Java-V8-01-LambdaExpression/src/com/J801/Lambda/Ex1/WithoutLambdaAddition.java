package com.J801.Lambda.Ex1;

public class WithoutLambdaAddition {

	public static void main(String[] args) {
		FuntionalInterfaceEx fex = new additionTest();
		int addValue = fex.add(10, 20);
		System.out.println("Ans: " + addValue);
		System.out.println("End Of Program");
	}

}

interface FuntionalInterfaceEx {
	public int add(int a, int b);
}

// Extra class is need to provide implementation.
class additionTest implements FuntionalInterfaceEx {

	@Override
	public int add(int a, int b) {
		int c = a + b;
		System.out.println("The sum of two numbers: " + c);
		return a + b;

	}
}