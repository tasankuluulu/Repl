package com.syntax.repl152_170;

public class Repl160 {
	void display(int num) {
		System.out.println(num);
	}

	void display(String str) {
		System.out.println(str);
	}

	void display(double num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		Repl160 obj = new Repl160();
		obj.display(100);
		obj.display("Syntax Technologies");
		obj.display(100.09);
	}
}

//Overload instance method display by having different types of parameters
//Inside each method write the logic to print value of the parameter
//
//Call all methods inside your main method
//
//Expected Output:
//100
//Syntax Technologies
//100.09
