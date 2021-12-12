package com.syntax.class17;

public class Cow {
static int price=5;
 String name; //instance variable
 String breed;
 String color;
 int age;
 double weight;
 
 
 
public Cow() {
	
}
public Cow(String name) {//local variable
	this();
	this.name = name;//you are referring to instance variable
}

public Cow(String name, String breed) {
	
	//this.name = name;
	this(name); //must be the first line of the code
	this.breed = breed;
	//this(name); can not put after
}
public Cow(String name, String breed, String color) {
	this(name,breed);
	this.color = color;
}
public Cow(String name, String breed, String color,int age) {
	
	//this.name = name;
	//this.breed = breed;
	//this.color = color; 
	this.age = age;
	
}
public Cow(String name, String breed, String color, int age, double weight) {

	//this.name = name;
	//this.breed = breed;
	//this.color = color;
	
	this(name,breed,color,age); //im repeating but now have to write less code
	this.weight = weight;
}
void printName() {
	System.out.println(name);
}
void printAllInfo() {
	System.out.println("name "+name+" breed "+breed+" color "+color+" age "+age+" weight "+weight);
}

 
}
