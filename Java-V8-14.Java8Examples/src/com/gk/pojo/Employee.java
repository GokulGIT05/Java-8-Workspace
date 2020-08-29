package com.gk.pojo;

public class Employee {

	private String name;
	private int age;
	private int salary;
	private String company;

	public Employee(String name, int age, int salary, String company) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", company=" + company + "]";
	}
	
	

}
