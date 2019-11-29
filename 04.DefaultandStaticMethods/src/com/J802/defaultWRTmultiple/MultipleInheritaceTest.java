package com.J802.defaultWRTmultiple;

public class MultipleInheritaceTest implements Left, Right {

	public static void main(String[] args) {
		MultipleInheritaceTest test = new MultipleInheritaceTest();
		test.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Left.super.m1();
		Right.super.m1();
	}

}
