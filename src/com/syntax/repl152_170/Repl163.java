package com.syntax.repl152_170;

public class Repl163 {
	public static void main(String[] args) {
		ParentRepl163 obj = new ParentRepl163();
		ChildRepl163 obj1 = new ChildRepl163();
		obj.method();
		obj1.method();
	}
}

//In Parent Class create a method with name method() that will print  "Parent method"
//
//Override method() in Child class that will print "Child method"
//
//In Main Class create objects of child and parent class and call its method. 
//
//Expected Output:
//Parent method
//Child method
