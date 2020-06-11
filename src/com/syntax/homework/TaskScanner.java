package com.syntax.homework;

import java.util.Scanner;

public class TaskScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter First Name");
		String name = scanner.next();
		System.out.println("Please Enter Surname");
		String surname = scanner.next();
		System.out.println(name + " " + surname);
		scanner.close();

	}

}
