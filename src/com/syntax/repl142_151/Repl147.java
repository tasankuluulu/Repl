package com.syntax.repl142_151;

public class Repl147 {
	public static void main(String[] args) {
		CarObjects obj1 = new CarObjects("Toyota 2019", 10000, 250);
		CarObjects obj2 = new CarObjects("BMW 2019", 326490, 2);
		
		System.out.println(obj1.carStockValue());
		System.out.println(obj2.carStockValue());
	}

}

//In carObject class:
//Create instance variables as below.
//model
//price, 
//quantity
//
//Create a constructor that will initialize instance variables. 
//
//Create a method with name carStockValue. Write logic to calculate the total values of cars in stock and print the result. 
//
//run the application in Main Class
//
//Expected Output:
//Toyota 2019 Stock Value 2500000.0
//BMW 2019 Stock Value 652980.0
//
//Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations. 
