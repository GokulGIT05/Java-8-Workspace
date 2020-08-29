package com.J801.defaultDemo;

public interface DefaultInterface {
	
	default void defaultMethod() {
		System.out.println("Inside defaultMethod() ");
	}

}
