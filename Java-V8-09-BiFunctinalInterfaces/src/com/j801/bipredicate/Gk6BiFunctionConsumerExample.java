package com.j801.bipredicate;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Gk6BiFunctionConsumerExample {

	// Demo Program to Increment Employee Salary by using BiFunction & BiConsumer
	public static void main(String[] args) {

		ArrayList<EmployeeConsumer> theEmployees = new ArrayList<EmployeeConsumer>();

		// This function return employee object.
		BiFunction<String, Double, EmployeeConsumer> theBifn = (ename, esal) -> new EmployeeConsumer(ename, esal);
		theEmployees.add(theBifn.apply("Gk1", 20000.0));
		theEmployees.add(theBifn.apply("Gk2", 10000.0));
		theEmployees.add(theBifn.apply("Gk3", 30000.0));
		theEmployees.add(theBifn.apply("Gk4", 40000.0));
		theEmployees.add(theBifn.apply("Gk5", 50000.0));

		for (EmployeeConsumer emp : theEmployees) {
			System.out.println(emp);
		}

		System.out.println("****************End Of BiFunction****************");
		
		// Consumer to increase the salary.
		BiConsumer<EmployeeConsumer, Double> theBiConsumer = (emp, salInc) -> emp.salary = emp.salary + salInc;
		
		for (EmployeeConsumer emp : theEmployees) {
			theBiConsumer.accept(emp, 25000.0);
		}

		for (EmployeeConsumer emp : theEmployees) {
			System.out.println(emp);
		}

	}

}

class EmployeeConsumer {

	String name;
	double salary;

	public EmployeeConsumer(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}
