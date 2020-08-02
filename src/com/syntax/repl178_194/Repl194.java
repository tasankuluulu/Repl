package com.syntax.repl178_194;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Repl194 {
	
	public static boolean isA (String country) {
		if(country.charAt(0) == 'A') {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {

		List<String> countries = new LinkedList<>();
		countries.add("Armenia");
		countries.add("USA");
		countries.add("Kazakhstan");
		countries.add("Australia");
		countries.add("Pakistan");
		countries.add("Russia");
		countries.add("Azerbaijan");
		
		Iterator<String> country = countries.iterator();
		while(country.hasNext()) {
			String it = country.next();
			if(isA(it)) {
				country.remove();
			}
		}
		System.out.println(countries);
	}
}

//Create a method that will remove an element based on the specified condition from given List and return new List;
//
//Expected Output:  
//[USA, Kazakhstan, Pakistan, Russia]
