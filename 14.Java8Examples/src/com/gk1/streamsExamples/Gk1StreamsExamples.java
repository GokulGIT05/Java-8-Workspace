package com.gk1.streamsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.gk.pojo.Employee;

public class Gk1StreamsExamples {

	public static void main(String[] args) {

		List<Employee> employeeList = loadEmployeeData();

		System.out.println(employeeList.stream().collect(Collectors.groupingBy(e -> "Gk3"))); // All the employees are groupby Gk3

		List<Employee> sortByAge = employeeList.stream()
												.sorted(Comparator.comparingInt(emp -> emp.getAge()))
												.collect(Collectors.toList());
		System.out.println(sortByAge);
		
		Employee empDetail = employeeList.stream().filter(emp -> emp.getName().equals("Gk1")).findFirst().orElse(null);
		System.out.println(empDetail);
		
		List<Employee> empDetailList = employeeList.stream().filter(emp -> emp.getName().equals("Gk1")).collect(Collectors.toList());
		System.out.println(empDetailList);
		
		
		Map<String, List<Employee>> empMap = new HashMap<String,List<Employee>>();
		empMap  = employeeList.stream().collect(Collectors.groupingBy(emp -> emp.getName())); // Inside Lambda(grouping By) Everything is run time. 
		System.out.println(empMap);
		
		List<String> empNames =  employeeList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
		System.out.println(empNames);	
	}

	private static List<Employee> loadEmployeeData() {

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("Gk4", 29, 80000, "DXC4"));
		employeeList.add(new Employee("Gk1", 26, 50000, "DXC1"));
		employeeList.add(new Employee("Gk3", 28, 70000, "DXC2"));
		employeeList.add(new Employee("Gk5", 30, 90000, "DXC7"));
		employeeList.add(new Employee("Gk2", 27, 60000, "DXC5"));
		employeeList.add(new Employee("Gk1", 50, 50000, "DXC1"));
		employeeList.add(new Employee("Gk1", 60, 50000, "DXC1"));
		employeeList.add(new Employee("Gk3", 30, 90000, "DXC7"));

		return employeeList;
	}

}
