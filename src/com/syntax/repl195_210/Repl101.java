package com.syntax.repl195_210;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Repl101 {
	public static void main(String[] args) {
		Set<EmployeeRepl101> emp = new LinkedHashSet<>();
		emp.add(new EmployeeRepl101("John Doe", "123456789", 80000));
		emp.add(new EmployeeRepl101("Jane Smith", "987654321", 90000));
		emp.add(new EmployeeRepl101("Jackie Chan", "0", 1000000));

		Iterator<EmployeeRepl101> it = emp.iterator();
		while (it.hasNext()) {
			EmployeeRepl101 element = it.next();
			System.out.println(element.getFullName());
			System.out.println(element.getSSN());
			System.out.println(element.getSalary());
		}

	}

}

//Create an Employee class that will be fully encapsulated and will have:
//variables as FullName, ssn and salary
//constructor to initialize instance variables
//getters to have an access to instance variables
//
//Create a set collection that will store # objects of Employee type and using Iterator print the value of each variable
//
//Expected Output:
//John Doe
//123456789
//80000.0
//Jane Smith
//987654321
//90000.0
//Jackie Chan
//0
//1000000.0
