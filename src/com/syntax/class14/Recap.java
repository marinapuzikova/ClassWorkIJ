package com.syntax.class14;

import java.util.Arrays;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Nasiri   ";
		System.out.println(name.length());
		System.out.println(name.startsWith("n"));
		System.out.println(name.startsWith("A"));
		System.out.println(name.endsWith("r"));
		System.out.println(name.contains("p"));
		System.out.println(name.equals("NAsir"));
		System.out.println(name.equalsIgnoreCase("NAsir"));
		System.out.println(name.charAt(5));
		System.out.println(name.indexOf("i",4));
		System.out.println(name.substring(3));
		System.out.println("*************");
		System.out.println(name.substring(3,6));
		System.out.println(name.isEmpty());
		System.out.println(name.trim());
		String sentence="This is a Java class";
		System.out.println(Arrays.toString(sentence.split(" ")));
		System.out.println(sentence.split(" ")[3]);
		String str="Today is Tuesday. Today we have java class.";
		String[]strArr=str.split("[.]"); // we want to split String based on "." We need []
		System.out.println((Arrays.toString(strArr)));

		for(String s:strArr){
			System.out.println(s);
		}
String s="hello";
s=s.concat("World");
System.out.println(s);
String str3="   Welcome    ";
System.out.println(str3.trim());
String str4="this is immutable !!";
System.out.println(str4.endsWith("!"));


String subject="I lova java";
String[] splitted=subject.split(" ");
System.out.println(splitted.length);
	
	}
}
