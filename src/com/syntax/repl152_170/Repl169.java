package com.syntax.repl152_170;

public class Repl169 {

	public final static double avgElements(int[] a) {
		double sum = 0;
		for (int element : a) {
			sum += element;
		}
		return sum / a.length;
	}

	public static void main(String[] args) {
		int[] a = { 2, 7, 3, 8, 4 };
		System.out.println(avgElements(a)); // should print 4.8
	}
}

//Create final method avgElements that will average all the elements in an integer array (passed to the method as a parameter) and return the average.  
//
//Expected Output:
//4.8
