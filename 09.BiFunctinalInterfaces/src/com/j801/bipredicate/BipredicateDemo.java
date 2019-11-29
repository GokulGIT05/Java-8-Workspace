package com.j801.bipredicate;

import java.util.function.BiPredicate;

public class BipredicateDemo {

	// To Find sum of numbers is even or not.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiPredicate<Integer,Integer> theBi= (i1,i2) -> (i1+i2) %2 ==0;
		
		System.out.println("The Result: "+theBi.test(20, 30));
		System.out.println("The Result: "+theBi.test(21, 30));
	}

}
