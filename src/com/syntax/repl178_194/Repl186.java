package com.syntax.repl178_194;

import java.util.ArrayList;

public class Repl186 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();

		for (int i = 1; i <= 6; i++) {
			array.add(i * 111);
		}

		System.out.println(array);
		array.clear();
		System.out.println(array);
	}

}

//Create an Arraylist of type Integer. 
//Add below elements to it. 
//111
//222
//333
//444
//555
//666
//Print the ArrayList. 
//remove all the elements. 
//Print the Arraylist. 
// 
//Expected Output:
//[111, 222, 333, 444, 555, 666]
//[]