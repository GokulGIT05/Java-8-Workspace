package com.gk3.amigoTut;

import java.util.Optional;

public class GkOptinalWithPojo {

	public static void main(String[] args) {
			
	//	Student student = new Student("Gokul", "gokul@gmail.com");
		Student student = new Student("Gokul", null);
		
		/*
		String emailInUpperCase = s1.getEmail().toUpperCase();
		System.out.println(emailInUpperCase);
		*/
		
		// Declarative Way
		String email = student.getEmail()
							.map(String::toUpperCase)
							.orElse("Email Not Found");
		
		System.out.println(email);
		System.out.println("*********************************");
		
		// Other Way
		if(student.getEmail().isPresent()) {
			
			String email1 = student.getEmail().get();
			System.out.println("Email Converted: "+email1.toUpperCase());
		}else {
			System.out.println("Email Not Provided.");
		}
	}
}

class Student {

	private String name;
	private String email;

	public Student(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	// getter should be Optional type
	public Optional<String> getName() {
		return Optional.ofNullable(name);
	}
	
	public Optional<String>  getEmail() {
		return Optional.ofNullable(email);
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + "]";
	}
	
	
}