package com.syntax.repl142_151;

public class Repl142 {
	public static void main(String[] args) {

		SyntaxTechnologies obj = new SyntaxTechnologies();
		obj.print();

		SyntaxTechnologies obj1 = new SyntaxTechnologies("Syntax", 6, 2020, "07/30/2020");
		obj1.print();
	}
}

//1. Complete the SyntaxTechnologies class:
//
//Include the following class variables:
//* schoolName(String)
//* batch(int)
//* year(int)
//* lastDayOfClass(String)
//
//Write two constructors:
//* non-argument constructor
//* parameterized constructor
//
//Create method to display values of instance variables.
//
//2. In Main Class:
//Create two different objects of the SyntaxTechnologies class using both constructors and call display method.
//
//Expected Output:
//null 0 0 null
//Syntax 6 2020 07/30/2020