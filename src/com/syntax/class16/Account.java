package com.syntax.class16;

public class Account {
	private String userName;// Sensitive data
	private String password;
	private String name;
	private String address;
	private int age;
	private double accountBalance=10;

	public void setUserName(String AccountUserName) {
		if (AccountUserName.length() < 16) {
			userName = AccountUserName;

		} else {
			System.out.println("user name off this length is not allowed");
		}

	}

	public void setPassword(String accountPass) {
		if(accountPass.length()<16) {
		password=accountPass;
		
	}else {
		System.out.println("password off this length is not allowed");
	}
	}

	public void getBalance(String AccountUserName, String accountPassword) {
		if (userName.equals(AccountUserName)&&password.equals(accountPassword)) {
			System.out.println(accountBalance);
		}else {

		System.out.println("UserName is incorrect");
	}
}}
