package com.j803.biconsume;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Example1 {

	// Demo Program to Increment Employee Salary by using BiFunction BiConsumer
	public static void main(String[] args) {

		ArrayList<Employee> theEmployees = new ArrayList<Employee>();

		// This function return employee object.
		BiFunction<String, Double, Employee> theBifn = (ename, esal) -> new Employee(ename, esal);
		theEmployees.add(theBifn.apply("Gk1", 20000.0));
		theEmployees.add(theBifn.apply("Gk2", 10000.0));
		theEmployees.add(theBifn.apply("Gk3", 30000.0));
		theEmployees.add(theBifn.apply("Gk4", 40000.0));
		theEmployees.add(theBifn.apply("Gk5", 50000.0));

		for (Employee emp : theEmployees) {
			System.out.println(emp);
		}

		System.out.println();

		// Consumer to increase the salary.
		BiConsumer<Employee, Double> theBiConsumer = (emp, salInc) -> emp.salary = emp.salary + salInc;
		
		for (Employee emp : theEmployees) {
			theBiConsumer.accept(emp, 25000.0);
		}

		for (Employee emp : theEmployees) {
			System.out.println(emp);
		}

	}

}

class Employee {

	String name;
	double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}
