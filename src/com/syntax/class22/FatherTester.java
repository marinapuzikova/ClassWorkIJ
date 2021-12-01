package com.syntax.class22;

public class FatherTester {
    public static void main(String[] args) {
        //parent type variable ->Father son
        Father son=new Son("Sharif");
        // Son fath= new Father("SharifsFather"); //not possible,we can not directly store object of father class
                                                    // inside of variable of son class
        Son sharifObj=(Son)son;
        sharifObj.eat();




    }
}
