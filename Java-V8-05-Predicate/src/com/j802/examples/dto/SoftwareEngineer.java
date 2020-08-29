package com.j802.examples.dto;

public class SoftwareEngineer {
	
	public String name;
	public int age;
	public boolean isCouple;
	
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
