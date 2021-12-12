package com.syntax.class14;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Today is Tuesday. Today we have java class.";
		String[] strArr = str.split("[.]"); // we want to split String based on "." We need []
		System.out.println((Arrays.toString(strArr)));

		for (String s : strArr) {
			System.out.println(s);
		}
	}

}
