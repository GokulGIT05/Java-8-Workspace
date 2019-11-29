package com.J801.Lambda.Ex2;

public class WithLambdaLength {

	public static void main(String[] args) {
		// Different ways of lambda Exprs:
		
		FuntionalInterfaceEx1 fiLambda=(String str)-> {
														 return str.length();
														};
											
		
		
//		FuntionalInterfaceEx1 fiLambda=(str)-> str.length();
		int length=fiLambda.findLength("Gokul");
		System.out.println("The Length: "+length);
		System.out.println("End of Program");
		
		
	}

}

interface FuntionalInterfaceEx1 {
	public int findLength(String str);
}

