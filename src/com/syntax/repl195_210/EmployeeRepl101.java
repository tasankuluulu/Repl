package com.syntax.repl195_210;

public class EmployeeRepl101 {
	private String fullName, ssn;
	private double salary;

	EmployeeRepl101(String fullName, String ssn, double salary) {
		this.fullName = fullName;
		this.ssn = ssn;
		this.salary = salary;
	}

	public String getFullName() {
		return fullName;
	}

	public String getSSN() {
		return ssn;
	}

	public double getSalary() {
		return salary;
	}

}
