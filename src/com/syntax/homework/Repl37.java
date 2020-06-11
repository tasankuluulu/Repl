package com.syntax.homework;

import java.util.Scanner;

public class Repl37 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isThirsty, isSleepy;
		System.out.println("Are you thirsty?");
		isThirsty = scanner.nextBoolean();

		System.out.println("Are you sleepy?");
		isSleepy = scanner.nextBoolean();

		String answer;

		if (isThirsty && !isSleepy) {
			answer = "Water";
		} else if (isThirsty && isSleepy) {
			answer = "Coffee";
		} else if (!isThirsty && isSleepy) {
			answer = "Tea";
		} else {
			answer = "Nothing";
		}
		System.out.println("Looks like you need to drink " + answer);
		scanner.close();
	}

}
