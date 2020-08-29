package com.j801.primitivefi;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class Gk2FunctionInt {

	public static void main(String[] args) {

		// TOIntFunction
		IntFunction<Integer> theSquare = i -> i*i;
		System.out.println(theSquare.apply(5));
	
		ToIntFunction<String> theLength= s ->s.length();
		System.out.println(theLength.applyAsInt("Gokul"));
		
		//InttoDouble 		 
		IntToDoubleFunction thesqrt=i -> Math.sqrt(i);
		System.out.println(thesqrt.applyAsDouble(9));
	}

}
 