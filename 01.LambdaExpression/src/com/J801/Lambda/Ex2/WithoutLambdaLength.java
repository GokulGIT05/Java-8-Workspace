package com.J801.Lambda.Ex2;

public class WithoutLambdaLength {

	public static void main(String[] args) {
		FuntionalInterfaceEx fex= new LengthTest();
		System.out.println("The lenght: "+fex.findLength("Gokul"));
		System.out.println("End Of Program" );
	}

}

interface FuntionalInterfaceEx {
	public int findLength(String str);
}

class LengthTest implements FuntionalInterfaceEx {

	@Override
	public int findLength(String str) {
		int length=str.length();
		return length;
	}
}