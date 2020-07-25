package com.syntax.repl152_170;

public class Animal {
	String type;
	
	void eat() {
		System.out.println(type + " eats");
	}
	
	void sleep() {
		System.out.println(type + " sleeps");
	}
	
	Animal(String type) {
		this.type = type;
	}
}
