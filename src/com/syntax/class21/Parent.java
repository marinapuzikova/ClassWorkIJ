package com.syntax.class21;

public class Parent {
    void method(int num) {
        System.out.println("From Parent");
    }
}

class Child extends Parent {
    @Override
    void method(int num) {
        System.out.println("From Child");
    }


    /* @Override
    void method(int num) {
        System.out.println(num); //can't decrease the visibility
    }*/

    /* @Override
   public void method(int num) {
        System.out.println(num); //can't decrease the visibility
    }*/


}

class Tester {
    public static void main(String[] args) {
        Child child = new Child();
        child.method(10);
    }
}
