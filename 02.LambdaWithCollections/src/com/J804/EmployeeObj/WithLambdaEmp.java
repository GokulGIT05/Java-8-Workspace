package com.J804.EmployeeObj;

import java.util.ArrayList;
import java.util.Collections;

public class WithLambdaEmp {

	public static void main(String[] args) {

		ArrayList<Employee> theEmployees=new ArrayList<Employee>();
		
		theEmployees.add(new Employee(13, "Gk13"));
		theEmployees.add(new Employee(14, "Gk14"));
		theEmployees.add(new Employee(1, "Gk1"));
		theEmployees.add(new Employee(11, "Gk11"));
		theEmployees.add(new Employee(12, "Gk12"));
		
		System.out.println("Before Sorting: "+theEmployees.toString());
		
		// Lambdas		
		Collections.sort(theEmployees, (E1,E2) -> (E1.empNo < E2.empNo)?1:(E1.empNo > E2.empNo)?-1:0);
		
		System.out.println("After Sorting: "+theEmployees);
	}

}

class Employee{
	
	int empNo;
	String empName;
	
	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + "]";
	}

	public int getEmpNo() {
		return empNo;
	}

	public String getEmpName() {
		return empName;
	}
	
	
	
	
}