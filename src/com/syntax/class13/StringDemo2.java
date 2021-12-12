package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if string empty or not
		String name=" ";
		
		System.out.println(name.isEmpty());//empty looks for anything even spaces
		name=" Silva";
		System.out.println(name.isEmpty());
	String str="           Batch11 is great           ";
	System.out.println(str.trim()); //to remove spaces before 1st character and after last character
	String str2="This is an easy class";
																//we can do multiple chaining:
	System.out.println(str2.toLowerCase().startsWith("t")); // first it converts to lower case then if String starts with specific character or not
															
	System.out.println(str2.startsWith("L"));
	System.out.println(str2.endsWith("s")); // if String ends with specific character or not
	System.out.println(str2.endsWith("m"));
	System.out.println(str2.endsWith("easy"));// if String ends with specific word
	System.out.println(str2.endsWith("class"));
	}
}
