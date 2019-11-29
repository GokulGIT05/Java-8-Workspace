package com.J801.Test;

public class Employee {

	String name;
	String designation;
	double salary;
	String city;

	public Employee(String name, String designation, double salary, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}
	/*
	 * @Override public String toString() { return "Employee [name=" + name +
	 * ", designation=" + designation + ", salary=" + salary + ", city=" + city +
	 * "]"; }
	 */

	public String toString() {
		String str = String.format("(%s,%s,%.2f,%s)", name, designation, salary, city);
		return str;
	}

}
