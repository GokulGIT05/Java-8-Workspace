package com.j801.bipredicate;

import java.util.function.BiFunction;

public class Ex2 {

	// Calculate Monthly Salary With Employee and TimeSheet By using BiFunction
	public static void main(String[] args) {

		Employee theEmp = new Employee("1", "Gk1", 5000);
		TimeSheet theSheet = new TimeSheet("11", 20);

		BiFunction<Employee, TimeSheet, Double> theBifnSalary = (emp, ts) -> {
			if (emp.empno.equals(ts.empNo)) {
				return emp.dailyWages * ts.days;
			} else
				System.out.println("Emp id doesnot match");
				return 0.0;
		};

		System.out.println("Employee Salary Per Months is: " + theBifnSalary.apply(theEmp, theSheet));
	}

}

class Employee {
	String empno;
	String name;
	double dailyWages;

	public Employee(String empno, String name, double dailyWages) {
		super();
		this.empno = empno;
		this.name = name;
		this.dailyWages = dailyWages;
	}

}

class TimeSheet {
	String empNo;
	int days;

	public TimeSheet(String empNo, int days) {
		super();
		this.empNo = empNo;
		this.days = days;
	}

}
