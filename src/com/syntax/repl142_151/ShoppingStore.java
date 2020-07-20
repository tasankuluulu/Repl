package com.syntax.repl142_151;

public class ShoppingStore {
	String item;
	double price;
	double quantity;
	
	ShoppingStore(String item, double price, double quantity) {
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}
	
	double itemTotalPrice() {
		return price * quantity;
		
	}
}
