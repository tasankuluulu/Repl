package com.syntax.repl142_151;

public class CarObjects {
	String model;
	double price;
	int quantity;
	
	CarObjects(String model, double price, int quantity) {
		this.model = model;
		this.price = price;
		this.quantity = quantity;
	}
	
	String carStockValue() {
		double total = quantity * price;
		String str = model + " Stock Value " + total;
		return str;
	}

}
