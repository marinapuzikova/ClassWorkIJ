package com.syntax.class16;

public class Dog {
	String name;
	static int noOfLegs = 4;
	String color;

	void displayColor() {
		System.out.println(color);
	}

	void displayName() {
		System.out.println(name);
		System.out.println(noOfLegs);// we can access static variable inside this method
	}

	void printInfo() {
		displayName();
		displayColor();
	}

	static void displayLegs() { // static method
		System.out.println(noOfLegs);
		// System.out.println(name); can not be print because Java get confused,
		// program doesn't know which name of object to print because "name" is instance
		// variable
	}
}
