package com.syntax.repl178_194;

public class Person {
	private static String firstname, lastname;
	private static int birthmonth, birthday, birthyear;
	private static String ssn;
	
	Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthmonth = birthmonth;
		this.birthday = birthday;
		this.birthyear = birthyear;
		this.ssn = ssn;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public String getSSN() {
		return ssn;
	}
	
	public String formatBirthdat() {
		return birthmonth + "/" + birthday + "/" + birthyear;
	}
	
}
