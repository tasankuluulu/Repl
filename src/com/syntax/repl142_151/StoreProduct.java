package com.syntax.repl142_151;

class StoreProduct {
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
		this.label = label;
		this.price = price;
		this.stock = stock;
//		this(label, price, category, hasExpiration, stock);
		category = "misc";
		hasExpiration = false;
	}

	StoreProduct(String label, double price) {
//		this(label, price, category, hasExpiration, stock);
		this.label = label;
		this.price = price;
		stock = 0;
	}

	void display() {
		System.out.printf("%s %.1f %s %b %s%n", label, price, category, hasExpiration, stock);
	}

}
