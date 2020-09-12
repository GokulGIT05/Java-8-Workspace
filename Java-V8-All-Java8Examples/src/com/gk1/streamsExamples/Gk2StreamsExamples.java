package com.gk1.streamsExamples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.gk.pojo.Employee;

public class Gk2StreamsExamples {

	public static void main(String[] args) {

		List<Employee> employeeList = loadEmployeeData();
		System.out.println("Raw Data: " + employeeList);

		// 1. Sorting By Age - using sorted.
		List<Employee> sortByAge = employeeList.stream().sorted(Comparator.comparing(emp -> emp.getAge())) // need to check for customized sorting.
				.collect(Collectors.toList());
		System.out.println(sortByAge);
		
		// 2. Sorting Using Comparotor in reverse order
		List<Employee> reverseOfName = employeeList.stream()
				.sorted((obj1, obj2) -> obj2.getName().compareTo(obj1.getName())) // Only Objects are allowed inside,
																					// primitives are not allowed.
				.collect(Collectors.toList());
		System.out.println(reverseOfName);

		// 3. Alternate Way to Sort using Method Reference.
		List<Employee> usingMethodReference = employeeList.stream()
				.sorted(Comparator.comparing(Employee::getAge).reversed()) // Best way to use, because it accepts
																			// primitive too.
				.collect(Collectors.toList());
		System.out.println("Reverse of Age: " + usingMethodReference);

		// 4. Generating Map<String,List<Employee>> String is company and its employees. Using groupingBy
		Map<String, List<Employee>> mapOfEmp = employeeList.stream()
				.collect(Collectors.groupingBy(emp -> emp.getCompany()));
		System.out.println(mapOfEmp);
		// We can't apply stream to Map.

		// 5. Getting only Unique Offices in List - Using map
		Set<String> companyList = employeeList.stream().map(emp -> emp.getCompany()).collect(Collectors.toSet());
		System.out.println("Company List: " + companyList);
		
		// 6. Get Only Employee which works in DXC1 Company
		List<Employee> empFromSpecificCompany  = employeeList.stream()
																.filter(emp -> emp.getCompany().equals("DXC1"))
																.collect(Collectors.toList());
		System.out.println("Emp from DXC1: "+empFromSpecificCompany);
		
		
		
	}

	private static List<Employee> loadEmployeeData() {

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("Gk4", 29, 80000, "DXC4"));
		employeeList.add(new Employee("Gk1", 26, 50000, "DXC1"));
		employeeList.add(new Employee("Gk3", 28, 70000, "DXC2"));
		employeeList.add(new Employee("Gk5", 30, 90000, "DXC2"));
		employeeList.add(new Employee("Gk2", 27, 60000, "DXC5"));
		employeeList.add(new Employee("Gk1", 50, 50000, "DXC1"));
		employeeList.add(new Employee("Gk1", 60, 50000, "DXC1"));
		employeeList.add(new Employee("Gk3", 30, 90000, "DXC7"));

		return employeeList;
	}

}
