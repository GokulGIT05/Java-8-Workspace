package com.J801.Funtion;

import java.util.ArrayList;
import java.util.function.Function;

public class FxExercise3 {

	// Program to find Total Monthly Salary of All Employees by using Function
	public static void main(String[] args) {

		ArrayList<Employee> theEmployees = new ArrayList<Employee>();

		populate(theEmployees);

		Function<ArrayList<Employee>, Double> theFunction = totalSallary -> {

			double total = 0;

			for (Employee emp : theEmployees) {
				total = total + emp.salary;
			}

			return total;

		};

		System.out.println("The Total Salary of the Employees: " + theFunction.apply(theEmployees));
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