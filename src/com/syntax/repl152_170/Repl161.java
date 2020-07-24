package com.syntax.repl152_170;

public class Repl161 {

	private void m1() {
		System.out.println("private m1 method");
	}

	private void m1(int num) {
		System.out.println("private m1 method with int parameter");
	}

	public static void main(String[] args) {
		Repl161 obj = new Repl161();
		obj.m1();
		obj.m1(3);
	}

}

//Overload private instance method m1
//
//Call each method from the main method. 
// 
//Expected Output:
//private m1 method 
//private m1 method with int parameter