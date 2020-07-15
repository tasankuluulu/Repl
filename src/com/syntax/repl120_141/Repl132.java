package com.syntax.repl120_141;

public class Repl132 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 1, 3, 5, 7 } };
		int[][] nums = reduce10(a);
		// print the elements from new array
		for (int[] i : nums) {
			for (int element : i) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

	// create method reduce10 here
	static int[][] reduce10(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] -= 10;
			}
		}
		return array;
	}

}

//For you to do:
//
//Complete the reduce10 method by making it subtract 10 from every element of the double array nums.
//The method should static and it should return a new 2D array object
//Print values from new array in the format below
//
//Expected Output:
//-9 -8 -7 -6 
//-6 -5 -4 -3 
//-9 -7 -5 -3
