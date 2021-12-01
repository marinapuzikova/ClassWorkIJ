package com.syntax.class20.Task3;

import com.syntax.class20.Task2.Programming;

public class Task3Tester {
    public static void main(String[] args) {

        Task3.method(false);
        Task3.method(10L);
        Programming programming = new Programming();
        Task3.method(programming);
    }
}
