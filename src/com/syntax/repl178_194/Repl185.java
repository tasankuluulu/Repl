package com.syntax.repl178_194;

import java.util.ArrayList;

public class Repl185 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();

		for (int i = 1; i <= 6; i++) {
			if (i <= 3) {
				array.add(111);
			} else {
				array.add(999);
			}
		}

		for (int element : array) {
			System.out.println(element);
		}
	}

}

//Create an arrayList of type Integer. 
//
//add below values. 
//111
//111
//111
//999
//999
//999
//
//Print all the values of List 1 by 1:
//
//Expected Output:
//111
//111
//111
//999
//999
//999