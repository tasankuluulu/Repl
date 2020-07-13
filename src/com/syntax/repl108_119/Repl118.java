package com.syntax.repl108_119;

public class Repl118 {

	public String spaceOut(String str) {
		String word = "";
		for (int i = 0; i < str.length(); i++) {
			word += str.charAt(i) + " ";
		}
		return word;
	}
	
	public static void main(String[] args) {
		Repl118 obj = new Repl118();
		System.out.println(obj.spaceOut("hello"));
		System.out.println(obj.spaceOut("technology"));
	}

}

//Write a method header on line two with the following specs:    
//
//Returns:
//a String
//Name:
//spaceOut
//Parameters:
//a String
//
//Then complete the method by programming the following behavior
//Insert spaces after every character in the String s, then return the new string.
//See below examples (note the space at the end as well).
//
//Examples:
//spaceOut("hello") ==> "h e l l o "
//spaceOut("technology") ==> "t e c h n o l o g y "
