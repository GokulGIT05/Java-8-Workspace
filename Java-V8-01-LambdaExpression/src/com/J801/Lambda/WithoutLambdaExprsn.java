package com.J801.Lambda;

public class WithoutLambdaExprsn {

	public static void main(String[] args) {
		Interf imp = new Demo();
		imp.m1();

	}
}

interface Interf {
	public void m1();
}

class Demo implements Interf {

	@Override
	public void m1() {

		System.out.println("Inside m1 Method");
	}

}