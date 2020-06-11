package com.syntax.homework;

import java.util.Scanner;

public class Repl39 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your mark");
		int mark = scanner.nextInt();
		char grade = 0;

		if (mark >= 1 && mark <= 25) {
			grade = 'F';
			System.out.println("Your grade is " + grade);
		} else if (mark > 25 && mark <= 45) {
			grade = 'E';
			System.out.println("Your grade is " + grade);
		} else if (mark > 45 && mark <= 50) {
			grade = 'D';
			System.out.println("Your grade is " + grade);
		} else if (mark > 50 && mark <= 60) {
			grade = 'C';
			System.out.println("Your grade is " + grade);
		} else if (mark > 60 && mark <= 80) {
			grade = 'B';
			System.out.println("Your grade is " + grade);
		} else if (mark > 80) {
			grade = 'A';
			System.out.println("Your grade is " + grade);
		} else {
			System.out.println("Please enter valid mark");
		}

		scanner.close();
	}

}
