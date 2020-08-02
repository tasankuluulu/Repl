package com.syntax.repl178_194;

import java.util.ArrayList;

public class Repl184 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 1; i <= 6; i++) {
			array.add(i * 111);
		}

		for (int i = 0; i <= 4; i += 2) {
			System.out.println(array.get(i));
		}
	}

}

//Create a array list that will hold Integer Objects:
//Add below elements to it. 
//111
//222
//333
//444
//555
//666
//
//Print first, third and fifth element from your array
//
//Expected Output:
//111
//333
//555