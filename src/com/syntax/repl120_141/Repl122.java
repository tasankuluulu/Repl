package com.syntax.repl120_141;

public class Repl122 {
	String country, capital;
	int population;

	Repl122(String country, String capital, int population) {
		this.country = country;
		this.capital = capital;
		this.population = population;
	}

	void printInfo() {
		System.out.printf("The capital of %s is %s and population is %d%n", country, capital, population);
	}

	public static void main(String[] args) {
		Repl122 obj1 = new Repl122("USA", "Washington DC", 330_000_000);
		Repl122 obj2 = new Repl122("Kazakhstan", "Astana", 18_500_000);
		obj1.printInfo();
		obj2.printInfo();
	}
}

//For you to do:
//
//Declare 3 instance variables to hold:
//name of the country
//capital
//population size
//
//Create a method to display values of instance variables
//
//Create 2 Object, assign values to instance variables, execute method display;
//
//Expected Output:
//The capital of USA is Washington DC and population is 330000000
//The capital of Kazakhstan is Astana and population is 18500000
