package com.syntax.repl152_170;

public class Repl166 {
	public static void main(String[] args) {
		Animal[] array = { new Cat("Cat"), new Kitten1("kitten1"), new Kitten2("kitten2"), new Kitten3("kitten3") };

		for (Animal element : array) {
			element.eat();
			element.sleep();
		}

	}
}

//Create a class Animal in which define instance variable type, constructor that will initialize instance variables and 2 methods eat and sleep.
//
//Create a subclass Cat in which override method sleep
//
//Create 3 Kitten subclasses of a Cat class and override method eat 
//for 1 kitten - eats milk
//for 2 kitten - eats snack
//for 3 kitten - eats everything
//
//In main method create object of Cat class and all 3 kittens classes and store into an array of Animals. Call available methods:
//
//Expected Output:
//Cat eats
//Cat sleeps a lot
//kitten1 eats milk
//kitten1 sleeps a lot
//kitten2 eats snacks
//kitten2 sleeps a lot
//kitten3 eats everything
//kitten3 sleeps a lot
