package com.syntax.class13;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="This is Batch 11. is great"; //method that will split the string and put elements in array
String[]arr=str.split("[.] ");//i want to split sentence based on the "."
//String[]arr=str.split(" ");//i want to split sentence whenever you see space
//for (String word:str) {
	System.out.println(arr[1]);
}

	}


