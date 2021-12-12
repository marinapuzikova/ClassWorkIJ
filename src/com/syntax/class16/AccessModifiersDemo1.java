package com.syntax.class16;

public class AccessModifiersDemo1 {
	private String name;// means this field will only be accessible to the method of this class
	int age;//default can get access to any class inside same package
	public double salary;// can be accessible inside any package of this project

	void displayNmae() {
		System.out.println(name);
	}

	void displayAge() {
		System.out.println(age);
	}

	void displaySalary() {
		System.out.println(salary);
	}

	public static void main(String[] args) {
		AccessModifiersDemo1 am = new AccessModifiersDemo1();
		am.name = "Nabil";
		am.age = 22;
		am.salary = 120000;
	}
}
