package com.syntax.class16;

public class RecapTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recap recap=new Recap();
		recap.number=10;
		
		recap.setConstantNumber();
		recap.setNumber(50);//we passed 50 and we called setNumber on line 6(Recap Class)
		recap.printNumber();
 
		Recap recap2=new Recap();
		
		recap2.printNumber();// because i made int number static on line 4 Recap class
							//now i can share it between methods
	}

}
