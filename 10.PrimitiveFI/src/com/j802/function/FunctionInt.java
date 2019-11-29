package com.j802.function;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionInt {

	public static void main(String[] args) {

		IntFunction<Integer> theSquare = i -> i*i;
		System.out.println(theSquare.apply(5));
	
		// TOIntFunction
		ToIntFunction<String> theLength= s ->s.length();
		System.out.println(theLength.applyAsInt("Gokul"));
		
		//InttoDouble 		 
		IntToDoubleFunction thesqrt=i -> Math.sqrt(i);
		System.out.println(thesqrt.applyAsDouble(9));
	}

}
 