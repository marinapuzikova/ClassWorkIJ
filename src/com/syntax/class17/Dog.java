package com.syntax.class17;

public class Dog {
	private String name;//1.declaring fields
	private String color;
	private String breed;
	private int age;
	private double weight;
	
//2. writing constructor //passing parameters
public Dog(String dogName,String dogColor,String dogBreed,int dogAge,double dogWeight) {//constructor
	System.out.println("Dog constructor is called");
	name=dogName; //purpose of the constructor is to initialize the fields 
	color=dogColor;//im assigning value 
	breed=dogBreed;
	age=dogAge;
	weight=dogWeight;
	System.out.println(dogName);// we can print out inside the constructor printing value of local variable
	printAge();
}
//3.creating method
public void printName() {
	System.out.println(name);
}
public void printBreed() {
	System.out.println(breed);
}
public void printAge() {
	System.out.println(age); 
}
}