package com.syntax.repl171_177;

public class ChaiTea extends Tea {
	ChaiTea(String teaType) {
		super(teaType);
	}
	
	public void addShugar() {
		System.out.println("For " + teaType + " Tea we need 1 spoon of sugar");
	}
}
