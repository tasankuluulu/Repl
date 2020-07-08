package com.syntax.repl108_119;

public class Repl116 {

	public static boolean ifEven(int num1, int num2) {
		return num1 % 2 == 0 && num2 % 2 == 0;
	}

	public static void main(String[] args) {

		System.out.println(ifEven(10, 15));
	}

}

//Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false
//( Return false if one or both given numbers are not even)
//
//Examples:
//bothEven(4,6) ==> true
//bothEven(3,4) ==> false
//bothEven(-1,1) ==> false
//
//Expected Output:
//false