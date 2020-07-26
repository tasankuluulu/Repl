package com.syntax.repl171_177;

public class Repl172 extends ParentRepl172 {

	public void m1() {
		System.out.println("Child class providing implementation");
	}

	public static void main(String[] args) {
		ParentRepl172 obj = new Repl172();
		obj.m1();
		obj.m2();
	}
}

//Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1
//
//Make Main class to be a derived class from Parent.
//
//In main method execute both methods
//
//Expected Output: 
//Child class providing implementation
//Parent class providing implementation
