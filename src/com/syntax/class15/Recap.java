package com.syntax.class15;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		String str = "This is Lubo. Lubo is break manager.";
		System.out.println(str.replace("Lubo", "Sorbon"));
		System.out.println(str.replaceAll("Lubo", "Sorbon"));// it takes regular expression and replacing it

		String str2 = "kajdfkjASASDB1234$%^*&*(";
		System.out.println(str2.replaceAll("[^A-Za-z0-9]", ""));// remove special characters->so we have to specified
																// everything beside
																// these characters by using ^
		System.out.println(str2.replace("[^A-Za-z0-9]", ""));
		String str3 = "";
		// String is not recommended because every time it will search the memory and
		// that will slow down the code
		for (int i = 0; i < 5; i++) {
			str3 = str3 + i;
		}
		System.out.println(str3);

		// When you have to change the value of a String variable always use
		// StringBuilder class(It saves memory)
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < 5; i++) {
			stringBuilder.append(i);// append means concatenation
		}

		System.out.println(stringBuilder);

		String str4 = "Me: Look it's not you it's me, walking away";// i have a str4 string and i want to convert this
																		// string to a StringBuilder
																		// because i want to use some methods from
																		// StringBuilder class

		StringBuilder strBuilder = new StringBuilder(str4);// i'm declaring object strBuilder
		strBuilder.reverse();//after converting str4 object to StringBuilder i can use any methods of StringBuilder class(for example->reverse method)
		System.out.println(strBuilder);
		str4 = strBuilder.toString();//going back from StringBuilder to String

	}

}
