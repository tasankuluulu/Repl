package com.syntax.repl142_151;

public class Employee {
	String name, lastName, startDate;
	int employeeId, salary;
	
	Employee() {
		
	}
	
	Employee(String name, String lastName, int employeeId, String startDate, int salary) {
		this.name = name;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.salary = salary;
	}
	
	void print() {
		System.out.printf("%s %s %d %s %d%n", name, lastName, employeeId, startDate, salary);
	}
}
