package com.syntax.repl108_119;

public class Repl109 {

	void newLine(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("newLine method implementation");
		}

	}

	public static void main(String[] args) {
		Repl109 obj = new Repl109();
		obj.newLine(3);

	}

}

//For you to do 
//
//1. Create method name it as newLine
//2. Add print statement inside method body as "newLine method implementation"
//3. Call newLine method three times
//
//Expected Output:
//newLine method implementation
//newLine method implementation
//newLine method implementation