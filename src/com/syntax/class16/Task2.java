package com.syntax.class16;

public class Task2 {
	/*
	 * Create a method that will take a String as a parameter and returns reversed
	 * String. Method should be available to all classes within your project and
	 * accessible by class name.(means static)
	 */
	public static String reverseStr(String str) {
		
			//creating object		//calling reverse method
		return new StringBuilder(str).reverse().toString();//multiple methods on the same line method chaining
	}
	/*
	 * StringBuilder strbuilder=new StringBuilder(str);
	 * strbuilder.reverse();
	 * String newStr=strBuilder.toString();
	 * return newStr;
	 */

}
