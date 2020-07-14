package com.syntax.repl120_141;

public class Repl125 {
	static int num;

	public static void main(String[] args) {
		num = 100;

		Repl125 obj = new Repl125();
		obj.num = 200;

		System.out.println(Repl125.num);
		System.out.println(num);
	}

}

//For you to do:
//
//Declare a static variable number that will hold an integer value:
//
//Access number from the main method and assign value to it.
//Create an Object of the class, access number in a nonstatic way and assing value of 200.
//
//Print out number using class name and using instance
//
//Expected Output:
//200
//200
