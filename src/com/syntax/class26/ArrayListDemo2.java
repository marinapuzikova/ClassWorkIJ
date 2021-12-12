package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subjects1=new ArrayList<>();
        subjects1.add("SDLC");
        subjects1.add("Manual Testing");
        subjects1.add("Java");
        subjects1.add("Git");
        subjects1.add("Selenium");
        subjects1.add("TestNg");
        subjects1.add("Cucumber");
        subjects1.add("Sql");
        subjects1.add("APIs");

        ArrayList<String> subjects2=new ArrayList<>();

        subjects2.add("TestNg");
        subjects2.add("Cucumber");
        subjects2.add("Sql");
        subjects2.add("APIs");
        subjects2.add("Docker");
        subjects2.add("AWS");
        subjects2.add("Mobile Testing");
        subjects2.add("Mock Interview");

        ArrayList<String> subjects=new ArrayList<>();
        subjects.addAll(subjects1);
        subjects.addAll(2,subjects2);
       // subjects1.clear();
        //subjects2.clear();
        System.out.println(subjects);
        System.out.println(subjects1);
        System.out.println(subjects2);
        System.out.println("__________________________");
        subjects1.retainAll(subjects2);//remove everything but retain elements from subject 2,else will be removed
        System.out.println(subjects1);


    }

}


