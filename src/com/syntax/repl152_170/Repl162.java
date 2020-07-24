package com.syntax.repl152_170;

public class Repl162 {
	static void print() {
		System.out.println("static method without parameter");
	}

	static void print(int num) {
		System.out.println("static method with int parameter");
	}

	public static void main(String[] args) {
		print();
		print(3);
	}
}

//Overload static method and then execute both overloaded methods.
//
//Expected Output:
//static method without parameter
//static method with int parameter
