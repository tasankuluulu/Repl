package com.syntax.homework;

import java.util.Scanner;

public class Task22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.next();

		String str = scanner.nextLine();

		System.out.println("Enter your mobile number");
		String phone = scanner.nextLine();

		System.out.println("Enter your age");
		int age = scanner.nextInt();

		System.out.printf("Your name is %s, your age is %d and your mobile number is %s", name, age, phone);

	}

}