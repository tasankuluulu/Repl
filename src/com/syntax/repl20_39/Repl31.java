package com.syntax.repl20_39;

import java.util.Scanner;

public class Repl31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Is it sunny outside?");

		boolean isSunny = scanner.nextBoolean();

		if (isSunny) {
			System.out.println("It is a sunny day, I should go somewhere!");
			System.out.println("What is the temperature outside?");
			int temp = scanner.nextInt();
			if (temp > 85) {
				System.out.println("I am going to the beach");
			} else {
				System.out.println("I am going to the park");
			}
		} else {
			System.out.println("I stay home and practice Java");
		}
		scanner.close();
	}
}

//For you to do:
//Declare boolean variable isSunny, ask the user "Is it sunny outside?"
//Declare int temperature and asl user to input any value. 
//
//Your program should check:
//If the weather is sunny output should be "It is a sunny day, I should go somewhere!"
//If it is not sunny output should be "I stay home and practice Java"
//
//If the weather is sunny you want to check the temperature "What is the temperature outside?"
//If the temperature is higher than 85 then "I am going to the beach"
//otherwise, "I am going to the park"
// 
//Example Output:
//Is it sunny outside?
//It is a sunny day, I should go somewhere!
//What is the temperature outside?
//I am going to the beach!
//
//Example Output:
//Is it sunny outside?
//I stay home and practice Java!
//
//Example Output:
//Is it sunny outside?
//It is a sunny day, I should go somewhere!
//What is the temperature outside?
//I am going to the park!
