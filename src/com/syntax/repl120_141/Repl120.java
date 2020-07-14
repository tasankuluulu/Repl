package com.syntax.repl120_141;

public class Repl120 {
	static int year, batchNum;
	static String schoolName;

	static void print() {
		System.out.printf("I am a student of batch %d studying at %s in the year of %d", batchNum, schoolName, year);

	}

	public static void main(String[] args) {

		year = 2020;
		batchNum = 6;
		schoolName = "Syntax";
		print();

	}

}

//For you to do:
//
//Declare 3 instance variables to hold: 
//
//year, school name and batch #
//
//Access variables from the main method and assign specific values to them
//Print values of your variables in the following format:
//
//Expected Output:
//I am a student of batch 6 studying at Syntax in the year of 2020
