package com.syntax.repl120_141;

public class Repl140 {

	static String maxLength(String[] array) {
		String maxLength = array[0];
		for (int i = 1; i < array.length; i++) {
			if (maxLength.length() < array[i].length()) {
				maxLength = array[i];
			}
		}
		return maxLength;

	}

	public static void main(String[] args) {
		String[] arr = { "hey", "yolo", "hi", "this is long" };
		System.out.println(maxLength(arr));
		// should print "this is long"
	}

}

//For you to do:
//
//Create the maxLength method that will accept String array of words and return the word with the largest length.
//
//Method should visible only within same package!
//
//Expected Output:
//this is long
