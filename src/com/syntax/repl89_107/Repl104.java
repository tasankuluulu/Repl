package com.syntax.repl89_107;

import java.util.Scanner;

public class Repl104 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		// leave above alone! write your code below
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.next();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].substring(0, 3));
		}

	}
}

//For you to do: 
//Create an array of names that will hold 5 String elements.
//Names must be taking from a user.
//
//Print out the first three characters of each element of the array, one per line.  
//
//Note: every array element must be at least 3 characters long. 
//
//Input Example:
//John
//Jane
//Jimmy
//Mike
//Emily
//
//Expected Output:
//Joh
//Jan
//Jim
//Mik
//Emi
