package com.syntax.repl120_141;

class Main {
	private static String printPrivate() {
		return "private";
	}

	static String printDefault() {
		return "default";
	}

	protected static String printProtected() {
		return "protected";
	}

	public static String printPublic() {
		return "public";
	}

}

public class Repl138 {
	public static void main(String[] args) {

		// Repl138.printPrivate();
		System.out.println(Main.printDefault());
		System.out.println(Main.printProtected());
		System.out.println(Main.printPublic());
	}
}

//For you to do:
//
//In AnotherClass declare a private, default, protected, public methods and have them each return the name of the what access modifier they are using.
//All methods should be accessible by class name
//
//Call methods of Another class inside Main class
//
//Expected Output:
//default
//protected
//public
