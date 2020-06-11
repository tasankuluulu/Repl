package com.syntax.homework;

import java.util.Scanner;

public class Repl38 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Is it weekend?");
		boolean isWeekend = scanner.nextBoolean();
		String answer;

		if (!isWeekend) {
			answer = "Manual testing";
		} else {
			answer = "Java";
		}
		System.out.println("Today you will be learning " + answer);

		scanner.close();
	}

}
