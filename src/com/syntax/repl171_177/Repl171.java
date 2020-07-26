package com.syntax.repl171_177;

public class Repl171 extends ParentRepl171 {

	public void m1() {
		System.out.println("m1 without parameters");
	}

	public void m1(int num) {
		System.out.println("m1 method with parameter");
	}

	public static void main(String[] args) {
		ParentRepl171 obj = new Repl171();
		obj.m1();
		obj.m1(10);
	}

}

//Create a Parent Class that will have two overloaded abstract methods m1
//
//Make Main class as concrete subclass to Parent Class 
//
//In main method call the methods. 
//
//Expected Output:
//m1 without parameters
//m1 method with parameter
