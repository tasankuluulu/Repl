package com.syntax.repl142_151;

public class Repl148 {
	public static void main(String[] args) {
		ShoppingStore item1 = new ShoppingStore("Blanket", 6.24875, 16);
		double totalItem1 = item1.itemTotalPrice();
		System.out.println(item1.item + " Total Value " + totalItem1);

		ShoppingStore item2 = new ShoppingStore("Mattress", 8.7836, 50);
		double totalItem2 = item2.itemTotalPrice();
		System.out.println(item2.item + " Total Value " + totalItem2);
		
		System.out.println("You purchased " + (totalItem1 + totalItem2) + " Today");
	}

}

//In ShoppingStore class:
//Create variables as below.
//item,
//price, 
//quantity
//
//Create a constructor to initialize instance variables.
//
//Create a method with name itemTotalPrice. 
//write a logic to to calculate the total values of items in stock. and print the result. 
//return the total value. 
//
//In Main Class. 
//Create two Object of ShoppingStore and pass the parameters to Constructor. 
//then using each object call the method itemTotalPrice. 
//Store the returned value of each object. 
//Calculate sum of both object and print the result. 
//
//Output:
//Blanket Total Value 99.98
//Mattress Total Value 439.18
//You purchased 539.16 Today
//
//
//Assignment Goals: Clean Code, proper naming convention, Choosing Variable Datatype,  This Keyword, Method Creation, Mathematic Operations, method return types.
