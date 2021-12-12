package com.syntax.class12;

public class Methods3Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method3 name of the class
		//method -name of variables can be anything,name of object
		//new keyword to create an object
		Methods3 method=new Methods3();
		//new Methods3().getMax(10,20);
		
//if we assigned any value
//we will get return    //im calling a method on the object method
		int max=method.getMax(10, 15);//passing 2 pieces of information
		System.out.println(max);

	}

}
