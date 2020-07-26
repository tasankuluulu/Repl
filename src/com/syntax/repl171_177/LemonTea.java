package com.syntax.repl171_177;

public class LemonTea extends Tea {
	LemonTea(String teaType) {
		super(teaType);
	}
	
	public void addShugar() {
		System.out.println("For " + teaType + " Tea we need 2 spoons of sugar");
	}
}
