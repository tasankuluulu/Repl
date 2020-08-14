package com.syntax.repl195_210;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Repl199 {
	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet<>();
		names.add(null);
		names.add("Sohil");
		names.add("Diego");
		names.add("Alijon");
		names.add("Asel");
		names.add("Sumair");

		for (String name : names) {
			System.out.println(name);
		}

		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

//Create a Set collection in which you want to preserve an order of inserted String Objects.
//Add the below values 
//null
//Sohil 
//Diego
//Alijon
//Asel
//Sumair 
// 
//Print values 1 by 1 using loop and Iterator 
//null
//Sohil
//Diego
//Alijon
//Asel
//Sumair
//null
//Sohil
//Diego
//Alijon
//Asel
//Sumair
