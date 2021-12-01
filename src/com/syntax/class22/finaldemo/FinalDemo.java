package com.syntax.class22.finaldemo;

class Parent {
    final double GRAVITY;

    Parent(double gravity) {
        this.GRAVITY = gravity;
    }

    final void printGravityValue() {
        // gravity=10.2;//cant change final variable
        System.out.println(GRAVITY);
    }
}

class Child extends Parent {
    double gravity=10.2;//we can redeclare it
    Child(double gravity) {
        super(gravity);
    }
   /* void printGravityValue(){
    }*/
}


public class FinalDemo {

}
