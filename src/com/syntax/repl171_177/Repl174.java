package com.syntax.repl171_177;

public class Repl174 implements MyInterface {
	public void method1() {
		System.out.println("implementation of method1");
	}

	public void method2() {
		System.out.println("implementation of method2");
	}

	public static void main(String[] args) {
		MyInterface obj = new Repl174();
		obj.method1();
		obj.method2();
	}
}

//Create an Interface with name as MyInterface
//Create two undefined methods method1 and method2
//
//Inherit the MyInterface to Main Class. 
//
//Execute both methods
//
//Expected Output:
//implementation of method1
//implementation of method2
