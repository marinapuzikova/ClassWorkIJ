package com.syntax.class12;

public class Method4 {
String method1() {
	return "Sandy";
}
String method2(String name) {
	return name;
}
void method3() { //void dont print anything
	System.out.println("Mandy");
}
void method4(String name) {
	System.out.println(name);//cant put return because its a void method
}
String method5(String name) {//this method that returns something
return "Aysha"; //java doesnt care what we write after return statement
					//only one return statement is allowed
}
}
