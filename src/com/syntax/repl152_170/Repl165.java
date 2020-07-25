package com.syntax.repl152_170;

public class Repl165 {
	public static void main(String[] args) {
		ChildRepl165 obj = new ChildRepl165();
		obj.printPublic();
		obj.printProtected();
		obj.printDefault();
	}
}

//Parent class create 4 methods with different level of access modifiers. In each method print "I am parent public/protected/default/private method".
//
//Override methods in child class
//
//In Main Class create object of the child class and see which methods are available
//
//Expected Output: 
//I am a child public method
//I am a child protected method
//I am a child default method
