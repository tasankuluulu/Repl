package com.syntax.repl142_151;

public class StoreProduct {
	String label, category;
	double price;
	boolean hasExpiration;
	int stock;

	StoreProduct(String label, double price, String category, boolean hasExpiration, int stock) {
		this.label = label;
		this.price = price;
		this.category = category;
		this.hasExpiration = hasExpiration;
		this.stock = stock;
	}

	StoreProduct(String label, double price, int stock) {
		this(label, price, category, hasExpiration, stock);
		category = "misc";
		hasExpiration = false;
	}
}
