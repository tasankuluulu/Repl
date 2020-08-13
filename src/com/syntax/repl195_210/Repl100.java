package com.syntax.repl195_210;

import java.util.LinkedHashSet;
import java.util.Set;

public class Repl100 {
	public static void main(String[] args) {
		Set<Student> set = new LinkedHashSet<>();
		set.add(new Student(101, "Samir", "Jawaid"));
		set.add(new Student(102, "Asel", "Umurzakova"));
		set.add(new Student(103, "Diego", "Juarez"));
		set.add(new Student(104, "Sohil", "Aryan"));
		set.add(new Student(105, "Alijon", "Nazarov"));

		for (Student student : set) {
			student.print();
		}
	}

}

//Create a student class that will have 
//variables as studentId, name and lastName
//constructor
//method to display students details
//
//Create a set that will store 5 different students in an order they been added to the collection.
//
//Execute method to display students details
//
//Expected Output:
//Student details: Samir Jawaid with id: 101
//Student details: Asel Umurzakova with id: 102
//Student details: Diego Juarez with id: 103
//Student details: Sohil Aryan with id: 104
//Student details: Alijon Nazarov with id: 105
