package com.syntax.practice;

public class tester {
    public static void main(String[] args) {
        values v=new values();
        pr obj=new pr(v.num1,v.num2,v.str);
        System.out.println(obj.sum());
    }
}
