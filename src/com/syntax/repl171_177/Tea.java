package com.syntax.repl171_177;

public abstract class Tea {
	String teaType;

	Tea(String teaType) {
		this.teaType = teaType;
	}
	
	abstract void addShugar();
}
