package com.syntax.class15;

public class SyntaxStudentTester {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		SyntaxStudent Sorbon = new SyntaxStudent();
		Sorbon.name = "Sorbon";
		Sorbon.id = "123";
		Sorbon.calculateFee();
		System.out.println(Sorbon.school);
		System.out.println(SyntaxStudent.school);//for static variable we can use name of the class
												//and then directly call this static variable,
												//the are also called  "class level variables"

	}

}
