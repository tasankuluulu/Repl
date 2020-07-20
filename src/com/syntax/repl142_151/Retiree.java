package com.syntax.repl142_151;

public class Retiree extends Student {
	String seniorActivity;

	Retiree(String name, String lastName, int age, int salary, int grade, String seniorActivity) {
		super(name, lastName, age, salary, grade);
		this.seniorActivity = seniorActivity;
	}

	void print() {
		System.out.printf("%s %s %d %s%n", name, lastName, age, seniorActivity);
	}

}
