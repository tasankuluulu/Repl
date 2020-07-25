package com.syntax.repl152_170;

public class Repl164 {
	public static void main(String[] args) {
		ParentRepl164[] obj = { new Child1Repl164(), new Child2Repl164(), new Child3Repl164() };

		for (ParentRepl164 array : obj) {
			array.hello();
		}
	}
}

//Create a method hello() in parent class that will print "method in Parent class" then override  that method is 3 Subclasses implementing login to print "method in Child1/Child2/Child3 class"
//
//In Main Class create 3 object of the child classes and store in into an array and call method hello():
//
//Expected Output:
//method in Child1 class
//method in Child2 class
//method in Child3 class
