package com.syntax.class13;

public class StringDemo3 {
	public static void main(String[] args) {
		String name = "This class is easy";
		System.out.println(name.contains("lemon"));// if String contains certain name or not
		System.out.println(name.contains("class"));
		System.out.println(name.contains("i")); // if contains character

		String str2 = "hello";
		String str3 = "Hello";
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		System.out.println(str2.charAt(0)); // if we want to find out what is the character at index (0)
		System.out.println(str2.charAt(2));
		// System.out.println(str2.toUpperCase().charAt(2));just an example
		System.out.println(str2.indexOf('l'));// it will get first l
		System.out.println(str2.indexOf('l', 2));// it will pass l at index2
		System.out.println(str2.indexOf('l', 3));// it will pass l at starts searching at index 3
		System.out.println(str2.indexOf('l', str2.indexOf('l') + 1));// hey java starts searching after first letter l
		System.out.println(name.substring(10)); // from the larger String you want to get something in between(10)
												// -means ignores first 10 characters
		System.out.println(name.substring(5, 9)); // i only want letters from index 5 to 11 (11th character is
													// not including)
	}

}
