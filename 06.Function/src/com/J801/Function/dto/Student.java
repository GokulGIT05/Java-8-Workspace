package com.J801.Function.dto;

public class Student {

	public String name;
	public int marks;
	
	
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
