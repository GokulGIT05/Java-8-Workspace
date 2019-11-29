package com.J801.defaultDemo;

public class TestWOverriding implements DefaultInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestWOverriding theObj=new TestWOverriding();
		theObj.defaultMethod();

	}
	
	public  void defaultMethod() {
		System.out.println("Inside Overridden default method");
	}

}
