package com.J801.Funtion;

public class Student {

	String name;
	int marks;
	
	
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
