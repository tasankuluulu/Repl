package com.syntax.repl142_151;

public class EmployeeForRepl150 extends Person {
	int salary;

	EmployeeForRepl150(String name, String lastName, int age, int salary) {
		super(name, lastName, age);
		this.salary = salary;
	}

	public void print() {
		System.out.printf("%s %s %d %d%n", name, lastName, age, salary);
	}

}
