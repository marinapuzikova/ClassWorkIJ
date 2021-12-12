package com.syntax.class17;

public class Task01 {
	/*
	 * Write a java class that will have a constructor: one with parameters and
	 * second without any parameters. Create a separate Test class where you will
	 * execute both of the constructors 1 by 1.
	 */
	private String name; // instance variable
	private String breed;
	private String color;
	int age;
	
//access modifier	

	public Task01() {
		System.out.println("0 argument constructor");
	}
	public Task01(int number) {
		System.out.println("1 argument constructor");
		
	}
}
