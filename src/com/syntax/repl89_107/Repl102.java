package com.syntax.repl89_107;

import java.util.Scanner;

public class Repl102 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String word = inp.nextLine();
		// write your code below
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}

	}
}

//For you to do: 
//
//Inputs:
//String word;
//
//Write a for loop that will loop through every character of a word and print out each character, each on a separate line 
//
// Sample inputs/outputs:
//In: hello
//h
//e
//l
//l
//o
//
//In: zimbabwe
//z
//i
//m
//b
//a
//b
//w
//e
//
//In: wow!
//w
//o
//w
//!
