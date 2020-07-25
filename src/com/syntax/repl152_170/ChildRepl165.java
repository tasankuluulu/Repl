package com.syntax.repl152_170;

public class ChildRepl165 extends ParentRepl165 {
	public void printPublic() {
		System.out.println("I am a child public method");
	}

	protected void printProtected() {
		System.out.println("I am a child protected method");
	}

	void printDefault() {
		System.out.println("I am a child default method");
	}

//	private void printPrivate() {
//		System.out.println("I am a child private method");
//	}
}
