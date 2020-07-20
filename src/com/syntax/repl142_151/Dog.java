package com.syntax.repl142_151;

public class Dog {
	String dogName;
	static String dogBreed = "Mutt";
	double dogWeight;
	
	Dog(String dogName, double dogWeight) {
		this.dogName = dogName;
		this.dogWeight = dogWeight;
	}
	
	void print() {
		System.out.printf("%s %s %.1f%n", dogName, dogBreed, dogWeight);
	}
	
}
