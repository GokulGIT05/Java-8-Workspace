package com.J801.Test;

public class SoftwareEngineer {
	
	String name;
	int age;
	boolean isCouple;
	
	public SoftwareEngineer(String name, int age, boolean isCouple) {
		super();
		this.name = name;
		this.age = age;
		this.isCouple = isCouple;
	}

	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", age=" + age + ", isCouple=" + isCouple + "]";
	}
	
	

}
