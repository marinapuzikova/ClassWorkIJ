package com.syntax.groupProject.task2;

public class MarksTester {
    public static void main(String[] args) {
        /*Marks m1 = new A(56, 87, 93);
        m1.getPercentage();
        Marks m2 = new B(45, 76, 86.6, 90);
        m2.getPercentage();
         */

        Marks[] av = {new A(56, 87, 93), new B(45, 76, 86.6, 90)};
        for (Marks m : av) {
            m.getPercentage();
        }
    }
}

