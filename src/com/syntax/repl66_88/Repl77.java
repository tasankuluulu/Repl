package com.syntax.repl66_88;

import java.util.Scanner;

public class Repl77 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[5];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[nums.length - 1 - i]);
		}

		scan.close();
	}

}

//For you to do:
//Create an array of integers that will store 5 elements taken from a user
//Don't print any prompt message for the user
//Then print out all the elements you have created in the first loop in reverse order. 
//
//Example: 
//Input: 
//1
//2
//3
//4
//5
//Output:
//5
//4
//3
//2
//1
