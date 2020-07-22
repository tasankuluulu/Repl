package com.syntax.repl142_151;

public class Student extends EmployeeForRepl150 {
	int grade;

	Student(String name, String lastName, int age, int salary, int grade) {
		super(name, lastName,age, salary);
		this.grade = grade;
	}
	
	public void print() {
		System.out.printf("%s %s %d %d%n", name, lastName, age, grade);
	}
}
