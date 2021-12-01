package com.syntax.class20;

public class MethodOverLoading2 {

   static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void add(int... arr) {
       //it can handle everything but it has lowest priority
        int sum = 0;
        for (int number : arr) {
            sum = sum + number;
        }
        System.out.println(sum);
    }

    static void add(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    static void add(int num1, double num2) {
        System.out.println(num1 + num2);
    }

    static void add(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    static void add(double num1, float num2) {
        System.out.println(num1 + num2);
    }
}

   /* static void add(int[] array) {

        int sum = 0;
        for (int number : array) {
            sum = sum + number;
        }
        System.out.println(sum);
    }
    */



