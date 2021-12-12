package com.syntax.class12;

public class Method4Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method4 canBeAnyName=new Method4();
		canBeAnyName.method1();
		//System.out.println(canBeAnyName.method1());
		//value from method1 will be stored in name variable
		String name1=canBeAnyName.method1();
		System.out.println(name1);
		System.out.println(canBeAnyName.method2("Roman"));
		//System.out.println(canBeAnyName.method1());
		//String name=canBeAnyName.method3(); not possible because doesnt return anything
		canBeAnyName.method3();
		canBeAnyName.method4("Nasir");
		//canBeAnyName.method5("Henok"); //if we want to print we need to do sysout
		System.out.println(	canBeAnyName.method5("Henok"));//doesnt matter what value we pass it will still print what return in line 17 class Method4
	}

}
