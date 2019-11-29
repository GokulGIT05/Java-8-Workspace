package com.J801.Funtion;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FxExercise4 {

	// Program to perform Salary Increment for Employees by using Predicate Function
	public static void main(String[] args) {
		ArrayList<Employee> theEmployees = new ArrayList<Employee>();

		populate(theEmployees);

		System.out.println("Salary before increament: " + theEmployees);

		// If salary is less then 45000 then increase the salary by 5000.
		Predicate<Employee> theEmp = Emp -> Emp.salary <= 45000;

		/*
		 * Function<Employee, Employee> theFunction = fn -> { if (theEmp.test(fn)) {
		 * fn.salary = fn.salary + 3500; }
		 * 
		 * return fn;
		 * 
		 * };
		 */

		Function<Employee, Employee> theFunction = fn -> {
			fn.salary = fn.salary + 3500;
			return fn;

		};

		ArrayList<Employee> updatedEmployees = new ArrayList<Employee>();

		for (Employee emp : theEmployees) {
			if (theEmp.test(emp)) {
				updatedEmployees.add(theFunction.apply(emp));
			}
		}
		
		System.out.println("Before Increment Employees: "+theEmployees);
		System.out.println("Incremented Employees: "+updatedEmployees);
	}

	private static void populate(ArrayList<Employee> theEmployees) {
		theEmployees.add(new Employee("Gk1", 25000));
		theEmployees.add(new Employee("Gk2", 35000));
		theEmployees.add(new Employee("Gk3", 45000));
		theEmployees.add(new Employee("Gk4", 55000));
		theEmployees.add(new Employee("Gk5", 65000));
		theEmployees.add(new Employee("Gk6", 75000));

	}

}