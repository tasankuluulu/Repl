package com.syntax.repl171_177;

public class Repl175 implements FirstInterface, SecondInterface {
	public void firstMethod() {
		System.out.println("First Method implementing multiple Inheritance");
	}

	public void secondMethod() {
		System.out.println("Second Method implementing multiple Inheritance");
	}

	public static void main(String[] args) {
		Repl175 obj = new Repl175();
		obj.firstMethod();
		obj.secondMethod();
	}
}

//**Follow Steps Carefully.
//Step1: Create Interface as FirstInterface and create undefined method as firstMethod (without parameter)
//Step 2: Create another interface as SecondInterface in which create a method as secondMethod (Without Parameter)
//
//Step 3: Inherit both interfaces to Main class. 
//Step 4: Execute both methods
//
//Expected Output:
//First Method implementing multiple Inheritance
//Second Method implementing multiple Inheritance
