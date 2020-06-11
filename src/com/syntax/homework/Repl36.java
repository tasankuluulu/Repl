package com.syntax.homework;

import java.util.Scanner;

public class Repl36 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter two strings");
		String word1, word2;
		word1 = scanner.next();
		word2 = scanner.next();

		System.out.println("Please enter two numbers");
		int num1, num2;
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();

		if (num1 == num2 && word1.equalsIgnoreCase(word2)) {
			System.out.println("AND");
		} else if (num1 == num2 || word1.equalsIgnoreCase(word2)) {
			System.out.println("OR");
		} else if (num1 != num2 && !(word1.equalsIgnoreCase(word2))) {
			System.out.println("NONE");
		}

		scanner.close();
	}

}
