package com.syntax.class12;

public class MethodTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Line before method call");
		Methods methods = new Methods(); // creating object
		methods.times=3;
		//methods.sayHello();//calling the method
		//methods.sayHelloManyTimes();
		//methods.sayHelloManyTimesWithState();
		methods.sayHelloManyTimesWithParameter(10);
		System.out.println("line after method call");
	}

}
