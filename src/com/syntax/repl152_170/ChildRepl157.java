package com.syntax.repl152_170;

public class ChildRepl157 extends ParentRepl157 {
	void m1() {
		System.out.println("m1 method in child class");
	}
	
	void m2() {
		this.m1();
		super.m1();
	}
}
