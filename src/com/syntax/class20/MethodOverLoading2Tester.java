package com.syntax.class20;

public class MethodOverLoading2Tester {
    public static void main(String[] args) {
        MethodOverLoading2.add(10,10);
        MethodOverLoading2.add(10.5,10.5);
        MethodOverLoading2.add(10,10.5);
        MethodOverLoading2.add(10,10,10);
        int[] arr={10,10,50,40};
        MethodOverLoading2.add(arr);
        MethodOverLoading2.add(10.5,10.35f);
    }
}
