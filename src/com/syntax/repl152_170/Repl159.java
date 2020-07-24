package com.syntax.repl152_170;

public class Repl159 {

	int calc(int num1, int num2) {
		return num1 - num2;
	}

	int calc(int num1, int num2, int num3) {
		return this.calc(num1, num2) - num3;
	}

	int calc(int num1, int num2, int num3, int num4) {
		return this.calc(num1, num2, num3) - num4;
	}

	public static void main(String[] args) {
		Repl159 obj = new Repl159();
		System.out.println(obj.calc(43, 1, 1, 1));
		System.out.println(obj.calc(32, 1, 1));
		System.out.println(obj.calc(30, 10));
	}

}

//Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
//In main method execute all 3 methods to match the output:
// 
//Expected Output
//40 (should come from subtracting 4 numbers)
//30 (should come from subtracting 3 numbers)
//20 (should come from subtracting 2 numbers)