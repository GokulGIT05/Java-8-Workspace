package com.gk2.amigoTut.pojo;

public class Person {

	private String name;
	private Integer age;
	private Gender gender;

	public Person(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}

	public Person(String name, Integer age, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	
	
}
