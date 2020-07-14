package com.syntax.repl120_141;

public class Repl121 {
	int num;
	double num1;
	char character;

	Repl121(int num, double num1, char character) {
		this.num = num;
		this.num1 = num1;
		this.character = character;
	}

	void print() {
		System.out.println(num);
		System.out.println(num1);
		System.out.println(character);
	}

	public static void main(String[] args) {
		Repl121 obj1 = new Repl121(10, 10.23, 'a');
		Repl121 obj2 = new Repl121(100, 100.23, 's');
		obj1.print();
		obj2.print();
	}

}

//For you to do:
//declare 3 instance variables to hold an integer, double and char values.
//
//Create 2 instances of the class and assign values to variables and the print them
//
//Expected Output:
//10
//10.23
//a
//100
//100.23
//s
