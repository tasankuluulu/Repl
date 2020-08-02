package com.syntax.repl178_194;

import java.util.ArrayList;

public class Repl187 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		array.add("hi");
		array.add("yo");
		array.add("sup");
		array.add("yolo");
		array.add("boop");

		array.remove(0);
		array.remove(1);
		array.remove(2);
		System.out.println(array.get(0));
		System.out.println(array.get(1));
	}

}

//Create an array list to type String. 
//Add these values below to your arraylist
//hi
//yo
//sup
//yolo
//boop
//
//Remove 1, 3, 5 element from an array
//
//print remained values one by one in one line
//
//Expected Output:
//yo yolo 
