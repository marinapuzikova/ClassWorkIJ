package com.syntax.class15;

public class Dog {

	//variables which are declared outside of the method( or block of code) but inside of class calls Instance variable
		String name;  //Instance variable and we can use them without initialization
		String color; //we can use instance variables when we have to share smth between our methods
		static int noOfLegs=4; //static variable,it can not be used inside of method
		
		void sleep() {
			 int times=3;//if we declared a variable inside of loop or switch case statement or inside method or constructor-->local variable
			 			//before using local variable we MUST initialize them
			System.out.println(times);
			System.out.println(name+" is sleeping");
		}
		
		void eat() {
			//System.out.println(times); as times is local variable we can not access it outside of sleep method
			System.out.println(name+" can eat");

	}

}
