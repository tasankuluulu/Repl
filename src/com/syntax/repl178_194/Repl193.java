package com.syntax.repl178_194;

import java.util.LinkedList;

public class Repl193 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 1; i <= 6; i++) {
			list.add(i * 111);
		}
		
		int sum = 0;
		for (int element : list) {
			sum += element;
		}
		System.out.println("Result of sum is " + sum);
	}

}

//Create Linked List that will store Integer Objects
//
//Add the values below:
//111
//222
//333
//444
//555
//666
//
//Create a logic to calculate sum of the all the values in list. 
//
//Print the result of sum. 
//
//Expected Output:
//Result of sum is 2331
