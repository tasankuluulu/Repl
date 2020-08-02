package com.syntax.repl178_194;

import java.util.ArrayList;

import java.util.Scanner;

public class Repl188 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			array.add(scan.nextInt());
		}

		for (int element : array) {
			System.out.print(element + " ");
		}
	}

}

//Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line
//
//Numbers in:
//4
//62
//8
//5
//4
//
//Expected Output:
//4 62 8 5 4 