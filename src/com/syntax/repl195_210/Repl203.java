package com.syntax.repl195_210;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Repl203 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("mango", 10);
		map.put("apple", 30);
		map.put("orange", 20);
		map.put("mango", 40);
		map.put("mango", 40);

		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println("Key = " + key + " and value = " + map.get(key));
		}
	}

}

//Create HashMap 
//add values as below
//
//map.put("mango", 10); 
//map.put("apple", 30); 
//map.put("orange", 20); 
//map.put("mango", 40); 
// map.put("mango", 40);     
//
//Using iterator retrieve all keys and values if the format below:
//
//Expected Output:
//Key = orange and value = 20
//Key = apple and value = 30
//Key = mango and value = 40
