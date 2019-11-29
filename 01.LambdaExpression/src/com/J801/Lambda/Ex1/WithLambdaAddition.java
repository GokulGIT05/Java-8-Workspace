package com.J801.Lambda.Ex1;

public class WithLambdaAddition {

	public static void main(String[] args) {
		FuntionalInterfaceEx1 fiLambda=(a,b)-> System.out.println(a+b);
		fiLambda.add(5, 6);
		fiLambda.add(15, 6);
	}

}

interface FuntionalInterfaceEx1 {
	public void add(int a, int b);
}

