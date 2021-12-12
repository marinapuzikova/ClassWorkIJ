package com.syntax.class16;

public class Task1 {
	/*
	 * Create a method that will accept an array as parameters and will return a sum
	 * of all elements from that array. Method should be visibly only within same
	 * package and accessible by the creating an instance of the class.
	 */

	// method should be instance
	int sumArray(int[] array) {// this what parameters

		int sum = 0;

		for (int number : array) {
			sum += number;
		}
		return sum;
	}
//look at class 13  Methodsdemo
}
