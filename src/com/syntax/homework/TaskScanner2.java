package com.syntax.homework;

import java.util.Scanner;

public class TaskScanner2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		System.out.printf("Your age after 10 years is %d", age + 10);
		scanner.close();
	}

}
