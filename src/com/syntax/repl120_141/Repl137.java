package com.syntax.repl120_141;

public class Repl137 {

	protected String name, city, nameOfSchool;
	private int batchNum;

	Repl137(String name, String city, String nameOfSchool, int batchNum) {
		this.name = name;
		this.city = city;
		this.nameOfSchool = nameOfSchool;
		this.batchNum = batchNum;

	}

	void print() {
		System.out.printf("My name is %s and I live in %s. I study at %s in batch %d", name, city, nameOfSchool,
				batchNum);
	}

	public static void main(String[] args) {
		Repl137 stud = new Repl137("John", "Miami", "Syntax", 6);
		stud.print();
	}
}

//For you to do 
//In main class please declared the variables using different access modifiers that will hold value for:
//name
//city
//name of the school
//batch number
//
//Create a method to display details in following format:
//My name is ___ and I live in ___. I study at ___ in batch ___
//
//Assign values to the variables and execute method display
//
//Expected Output:
//My name is John and I live in Miami. I study at Syntax in batch 6
