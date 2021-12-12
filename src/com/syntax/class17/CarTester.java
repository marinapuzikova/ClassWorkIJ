package com.syntax.class17;

public class CarTester {

	public static void main(String[] args) {
		Car car=new Car("Tesla model x","Tesla","Model Y", //if i want to construct i have to pass 
				"Black",2018,-1,"123",-1,300,true);       //these parameters
		car.printName();
		car.printColor();
	
	
	
	Car car2=new Car("Tesla model x");
	car2.printName();
	
	Car car3=new Car();
	
	car3.sayHello();
}
}