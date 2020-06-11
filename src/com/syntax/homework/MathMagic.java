package com.syntax.homework;

public class MathMagic {
	 public static void main (String[] args) {
		    int myNumber = 50;
		    int stepOne = myNumber * 2;
		    int stepTwo = stepOne * 2;
		    int stepThree = stepTwo / myNumber;
		    int stepFour = stepThree + 17;
		    int stepFive = stepFour / 6;
		    System.out.printf("The magic number is %d", stepFive);
		  }
		}