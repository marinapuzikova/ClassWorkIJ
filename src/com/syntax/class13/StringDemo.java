package com.syntax.class13;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=new String("Marina");
				String name1="Mykl";
				System.out.println(name1.length());
				System.out.println(name.length());
				
				//method to convert Upper case to lover&upper
				System.out.println(name1.toLowerCase());
				System.out.println(name1.toUpperCase());
				String str="Sfuyhjjh5555%%%%";
				System.out.println(str.toUpperCase());
				
				//String concatenation method inside String class
				System.out.println(name1.concat(" "+name+" "));//not recommended to use,always use +
				int num=10;
				System.out.println(name+name1+num);
			//	System.out.println(name.concat(name1).concat(num)); not allowed to concat dif data types
	}

}
