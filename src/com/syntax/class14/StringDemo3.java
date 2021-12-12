package com.syntax.class14;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String str = "fejwdfjwytiaukyFGF%%%ED12345&&&*****";
		// i want to process the string
		//using[] because we are looking for patterns

		System.out.println(str.replaceAll("[012345]", "*"));// replacing number from 0 to 5 with *
		System.out.println(str.replaceAll("[0-5]", "*"));// replacing number from 0 to 5 with * shorter way
		System.out.println(str.replaceAll("[a-z]", "*"));// replacing lower case letters from a to z with *
		System.out.println(str.replaceAll("[A-Z]", "*"));// replacing Upper case letters from a to z with *
		System.out.println(str.replaceAll("[A-Za-z]", "*"));
		System.out.println(str.replaceAll("[A-Z]", "*").replaceAll("[a-z]","*"));
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", "*"));//replace everything else besides this(negated set)
		System.out.println(str.replaceAll("[&$]", "*"));
		System.out.println(str.replaceAll("[0-9]", ""));//it will replace numbers
	}
}
