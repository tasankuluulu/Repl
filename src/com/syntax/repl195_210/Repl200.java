package com.syntax.repl195_210;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Repl200 {
	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		map.put("Street", "Patrick ST");
		map.put("Suite", "265");
		map.put("City", "Vienna");
		map.put("Zip", "22180");
		map.put("Country", "United State");

		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(map.get(key));
		}
	}

}

//Create A Map that will preserve an order of entry objects
//
//Add below pairs :
//
//"Street" = "Patrick ST"
//"Suite" = "265"
//"City" = "Vienna"
//"Zip" = "22180"
//"Country" = "United State"
//
//Print all values of from the map 
//
//Expected Output:
//Patrick ST
//265
//Vienna
//22180
//United State
