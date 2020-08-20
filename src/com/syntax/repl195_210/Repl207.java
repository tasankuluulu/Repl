package com.syntax.repl195_210;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repl207 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");
		map.put("THREE", "CCC");
		map.put("FOUR", "DDD");
		map.put("FIVE", "EEE");
		Set<Entry<String, String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> it = entrySet.iterator();
		System.out.println("HashMap Before Replace :");

		while (it.hasNext()) {
			Entry<String, String> element = it.next();
			System.out.println(element.getKey() + " : " + element.getValue());
		}
		System.out.println("------------------");

		map.replace("THREE", "ASEL");
		map.replace("FIVE", "SUMAIR");
		
		Iterator<Entry<String, String>> it2 = entrySet.iterator();
		System.out.println("HashMap After Replace :");

		while (it2.hasNext()) {
			Entry<String, String> element = it2.next();
			System.out.println(element.getKey() + " : " + element.getValue());
		}

	}

}

//Create Hash Map. 
//add the follow values
//
//map.put("ONE","AAA");
//map.put("TWO","BBB");
//map.put("THREE","CCC");
//map.put("FOUR","DDD");
//map.put("FIVE","EEE");
//
//Using EntrySet print the key and values pairs using iterator only
//
//replace with below key THREE--> ASEL and key FIVE-->SUMAIR
//
//Using EntrySet print the key and values pairs using iterator only
//
//OUTPUT
//
//HashMap Before Replace :
//FIVE : EEE
//ONE : AAA
//FOUR : DDD
//TWO : BBB
//THREE : CCC
//------------------
//HashMap After Replace :
//FIVE : SUMAIR
//ONE : AAA
//FOUR : DDD
//TWO : BBB
//THREE : ASEL
