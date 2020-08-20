package com.syntax.repl195_210;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repl205 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Street", "Patrick ST");
		map.put("Suite", "265");
		map.put("City", "Vienna");
		map.put("Zip", "22180");
		map.put("Country", "United State");

		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getValue().toUpperCase());
		}

	}

}

//Create a HashMap of String. 
//
//Add below pair to it . 
//"Street" = "Patrick ST"
//"Suite" = "265"
//"City" = "Vienna"
//"Zip" = "22180"
//"Country" = "United State"
//
//Print all the values in upper case using entrySet 
//
//Expected Output: 
//265
//22180
//PATRICK ST
//UNITED STATE
//VIENNA
