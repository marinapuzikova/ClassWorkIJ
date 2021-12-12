package com.syntax.class16;

public class AccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account account1=new Account();
//account1.balance=123445 is not allowed to access
account1.setUserName("ashgar");
account1.setPassword("pass12344");
account1.getBalance("ashgar", "pass12344");
	}

}
