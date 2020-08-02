package com.syntax.repl178_194;

import java.util.LinkedList;

public class Repl190 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(0);
		list.add(1);

		for (int i = 0; i < 8; i++) {
			list.add(list.get(i) + list.get(i + 1));

		}
		for (int element : list) {
			System.out.print(element + " ");
		}
	}

}

//Create Linked List that will store first 10 numbers of fibonacci series
//
//Print number from Linked List 1 by 1 all in 1 line
//
//Expected Output:
//0 1 1 2 3 5 8 13 21 34 
