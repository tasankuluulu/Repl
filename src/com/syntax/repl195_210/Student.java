package com.syntax.repl195_210;

public class Student {
	int studentId;
	String name, lastName;

	Student(int studentId, String name, String lastName) {
		this.studentId = studentId;
		this.name = name;
		this.lastName = lastName;
	}

	void print() {
		System.out.printf("Student details: %s %s with id: %d%n", name, lastName, studentId);
	}

}
