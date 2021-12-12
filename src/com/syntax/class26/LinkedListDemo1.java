package com.syntax.class26;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {

        LinkedList<String> subjects = new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNg");
        System.out.println(subjects);
        subjects.set(2,"Python");//replacing Java(index 2) with Python
        System.out.println(subjects);

    }
}
