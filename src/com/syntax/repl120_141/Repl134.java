package com.syntax.repl120_141;

public class Repl134 {
	static int countVowels(String s) {

		String str = s.toLowerCase().replaceAll("[a,e,i,o,u]", "");
		return s.length() - str.length();
	}

	// test case below (dont change):
	public static void main(String[] args) {
		System.out.println(countVowels("obama")); // 3
		System.out.println(countVowels("happy friday! i love weekends")); // 9
	}
}

//Write a method with the following specs:  
//
//Returns:
//an integer
//Name:
//countVowels
//Parameters:
//a String called s
//Purpose:
//count the number of vowels in the string s.  Assume s is all lowercase.
//
//Examples:
//countVowels("obama") ==> 3
//countVowels("happy friday! i love weekends") ==> 9
