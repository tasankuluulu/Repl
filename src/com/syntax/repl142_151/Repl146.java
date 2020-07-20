package com.syntax.repl142_151;

public class Repl146 {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.print();
		
		Employee emp2 = new Employee("Joe", "Smith", 12345, "01/01/1970", 35000);
		emp2.print();

		}
	}
	


//1. Complete the Employee.java class:
//
//Include the following class variables:
//* name(String)
//* lastName(String)
//* employeeId(int)
//* startDate(String)
//* salary(int)
//
//
//Write two constructors:
//
//* non-argument constructor
//* parameterized constructor that will initialize all instance variables
//
//Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.
//
//
//Output:
// 
//null null 0 null 0
//Joe Smith 12345 01/01/1970 35000
