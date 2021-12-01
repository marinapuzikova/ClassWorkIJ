package com.syntax.class20;

public class MethodOverLoadingTester {
    public static void main(String[] args) {
        MethodOverLoading.add(10,10);
        MethodOverLoading.addDouble(10.5,10.5);
        MethodOverLoading.addIntDouble(10,10.5);
        MethodOverLoading.addInt(10,10,10);
        int[] arr={10,10};
        MethodOverLoading.addArray(arr);
    }
}
