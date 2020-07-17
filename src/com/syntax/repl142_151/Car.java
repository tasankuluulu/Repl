package com.syntax.repl142_151;

public class Car {
	static String make, model;
	static int numberOfDoors, topSpeed;
	static double price;

	Car(String make, String model, int numberOfDoors, int topSpeed, double price) {
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
	}

	Car(String make, String model, int topSpeed, double price) {
		this(make, model, numberOfDoors, topSpeed, price);
		numberOfDoors = 4;
	}

	Car(int numberOfDoors, int topSpeed, double price) {
		this(make, model, numberOfDoors, topSpeed, price);
		make = "unknown";
		model = "unknown";

	}

	Car(String make, String model, int numberOfDoors) {
		this(make, model, numberOfDoors, topSpeed, price);
		topSpeed = 90;
		price = 0;
	}

	static void display() {
		System.out.printf("%s %s %d %d %.1f%n", make, model, numberOfDoors, topSpeed, price);
	}

}
