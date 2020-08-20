package com.syntax.repl195_210;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repl206 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");
		map.put("THREE", "CCC");
		map.put("FOUR", "DDD");
		map.put("FIVE", "EEE");

		Set<Entry<String, String>> entrySet = map.entrySet();
		System.out.println("HashMap Before Remove :");
		for (Entry<String, String> element : entrySet) {
			System.out.println(element.getKey() + " : " + element.getValue());
		}
		System.out.println("------------------");
		Iterator<Entry<String, String>> it = entrySet.iterator();
		while (it.hasNext()) {
			Entry<String, String> element = it.next();
			if (element.getKey().equals("ONE") || element.getKey().equals("FOUR")) {
				it.remove();
			}
		}
		System.out.println("HashMap After Remove :");
		for (Entry<String, String> element : entrySet) {
			System.out.println(element.getKey() + " : " + element.getValue());
		}

	}

}

//Create a Hash Map of String pairs 
//add the follow values
//map.put("ONE","AAA");
//map.put("TWO","BBB");
//map.put("THREE","CCC");
//map.put("FOUR","DDD");
//map.put("FIVE","EEE");
//
//Using entry set print key and values pairs using loop
//
//Remove below from Map
//"ONE"
//"FOUR"
//
//Using entry set print key and values pairs using loop
//
//Expected Output:
//HashMap Before Remove :
//FIVE : EEE
//ONE : AAA
//FOUR : DDD
//TWO : BBB
//THREE : CCC
//------------------
//HashMap After Remove :
//FIVE : EEE
//TWO : BBB
//THREE : CCC
