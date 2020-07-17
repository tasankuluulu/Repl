package com.syntax.repl142_151;

class SyntaxTechnologies {
	static String schoolName, lastDayOfClass;
	static int batch, year;

	SyntaxTechnologies() {

	}

	SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass) {
		this.schoolName = schoolName;
		this.batch = batch;
		this.year = year;
		this.lastDayOfClass = lastDayOfClass;
	}
	
	public void print() {
		System.out.printf("%s %d %d %s%n", schoolName, batch, year, lastDayOfClass);
	}
}
