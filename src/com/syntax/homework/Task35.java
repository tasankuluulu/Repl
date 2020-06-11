package com.syntax.homework;

import java.util.Scanner;

public class Task35 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you need a loan?");
		boolean answer = scanner.nextBoolean();
		String eligibility;
		if (answer) {
			System.out.println("What is your credit score?");
			int score = scanner.nextInt();
			if (score < 600) {
				eligibility = "Not eligible";
			} else if (score >= 600 && score <= 700) {
				eligibility = "Maybe eligible";
			} else if (score >= 701 && score <= 800) {
				eligibility = "Eligible";
			} else {
				eligibility = "Definitely eligible";
			}
		} else {
			eligibility = "Unknown";
		}
		System.out.printf("The eligibility is %s", eligibility);
		scanner.close();

	}

}
