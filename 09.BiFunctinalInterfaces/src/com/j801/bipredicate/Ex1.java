package com.j801.bipredicate;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Ex1 {

	// Creation of Student object by taking name and rollno as input with BiFunction
	public static void main(String[] args) {
		
		ArrayList<Student> theStudents=new ArrayList<Student>();
		
		BiFunction<String, Integer, Student> theBiFn=(name,rollNo) -> new Student(name,rollNo);
		
		theStudents.add(theBiFn.apply("Gk1", 1));
		theStudents.add(theBiFn.apply("Gk2", 2));
		theStudents.add(theBiFn.apply("Gk3", 3));
		theStudents.add(theBiFn.apply("Gk4", 4));
		
		// Printing Values
		
		for(Student stud:theStudents) {
			System.out.println(stud);
		}
		
		
	}

}

class Student {

	String name;
	int rollNo;

	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	

}