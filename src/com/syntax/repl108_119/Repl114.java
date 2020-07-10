package com.syntax.repl108_119;

public class Repl114 {

	int mult(int num1, int num2) {
		return num1 * num2;
	}

	int add(int num1, int num2) {
		return num1 + num2;
	}

	int subs(int num1, int num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		Repl114 obj = new Repl114();
		System.out.println("Addition " + obj.add(15, 15));
		System.out.println("Multiplication " + obj.mult(10, 3));
		System.out.println("Subtraction " + obj.subs(20, 1));
	}

}

//For you to do :
//
//Step1: Create three methods that will accept 2 in parameters on integer type
//Step2: Write the logic in methods to perform actions below:
//
//The first method for multiplication
//The second method for addition 
//The third method for subtraction
//
//Step3: execute all methods
//
//1. for the addition method add two numbers to make 30 
//2. for multiplication multiply two numbers to make 30 
//3. for Subtraction subtract two numbers to equal 20
//
//Expected Output:
//Addition 30
//Multiplication 30
//Subtraction 20