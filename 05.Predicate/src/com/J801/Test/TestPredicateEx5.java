package com.J801.Test;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPredicateEx5 {

	// Employee Management Application
	public static void main(String[] args) {
		
		Employee theEmp=new Employee("Gokul", "CEO", 2000000.0, "Bangalore");
		
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(theEmp);
		employees.add(new Employee("Gokul1", "SE", 50000.0, "Bangalore"));
		employees.add(new Employee("Rahul", "Manager", 80000.0, "Bangalore"));
		employees.add(new Employee("Gk1", "Manager", 90000.0, "Hyderabad"));
		employees.add(new Employee("Gk2", "Manager", 180000.0, "Chennai"));
		employees.add(new Employee("Gk3", "Manager", 380000.0, "Triavandrum"));
		
		
		System.out.println(employees);
		
		
		Predicate<Employee> thePredicate=emp -> emp.designation.equals("Manager");
		
		display(thePredicate,employees);
		
		System.out.println("--------------------------------------------------------------------------------");

		Predicate<Employee> thePredicateCity= emp -> emp.city.equals("Bangalore");
		display(thePredicateCity,employees);
		
		System.out.println("--------------------------------------------------------------------------------");
		
		Predicate<Employee> theSalaryPredicate=emp -> emp.salary >  80000;
		display(theSalaryPredicate,employees);
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// If Employee is Manager and from Bangalore then fire him.
		Predicate<Employee> predicateJoin=thePredicate.and(thePredicateCity);
		display(predicateJoin, employees);
		System.out.println("--------------------------------------------------------------------------------");
		
		// Either Manager or less than 20000.
		display(thePredicate.or(theSalaryPredicate), employees);
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// To Select all emp who are not managers.
		display(thePredicate.negate(), employees);
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// Checking isEqual Method. To Check whether the given value is present in predicate of not.
		// To Check the String in list. We can use this isEqual Method.		
		Predicate<Employee> isEqualCheck=Predicate.isEqual(theEmp);	
		for(Employee emp:employees) {
			if(isEqualCheck.test(emp)) {
			System.out.println("Already Present: "+isEqualCheck.test(emp));
			}
		}
		
		System.out.println("--------------------------------------------------------------------------------");

		Predicate<Employee> isCEO=Predicate.isEqual(new Employee("Gokul", "CEO", 2000000.0, "Bangalore"));
		Employee theEmp1=new Employee("Gokul", "CEO", 2000000.0, "Bangalore");
		Employee theEmp2=new Employee("Gokul123", "CEO12", 2000000.0, "Bangalore");
		
		System.out.println(isCEO.test(theEmp1));
		System.out.println(isCEO.test(theEmp2));

	}

	private static void display(Predicate<Employee> thePredicate, ArrayList<Employee> employees) {
		// TODO Auto-generated method stub
		
		for(Employee emp:employees) {
			if(thePredicate.test(emp)) {
				System.out.println("The Employee details "+emp);
			}
		}
		
	}

}
	 	 	