package com.syntax.repl120_141;

public class Repl129 {
	static String country, continent;

	static String print() {
		String str = country + " located on " + continent + " continent";
		return str;
	}

	public static void main(String[] args) {
		country = "Morocco";
		continent = "Africa";
		System.out.println(print());
	}
}

//For you to do:
//
//Declare two static variables to hold
//country name
//continent
//
//Create a method to display the value of static variables in the following format:
// 
//____ located on ____ continent
//
//In the main method assign values to a static variable and execute method display
//
//Expected Output:
//Morocco located on Africa continent
