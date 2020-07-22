package com.syntax.repl142_151;

public class Person {
	String name, lastName;
	int age;
	
	Person (String name, String lastName, int age) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}
	
	
	public void print() {
		System.out.printf("%s %s %d %s%n", name, lastName, age);
	}
	

}
