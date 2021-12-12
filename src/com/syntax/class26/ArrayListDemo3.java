package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNg");


        
    }
}




        //DONT USE LOOPS IN ARRAYLIST WILL BE MISTAKES!!!
       /*for (int i = 0; i < subjects.size(); i++) {
            System.out.println(subjects.get(i));
        }
       for (int i = 0; i < subjects.size(); i++) {//i want to remove all elements which have more than 4 characters
            if(subjects.get(i).length()>4){
                subjects.remove(i);
            }
        }
        /*System.out.println(subjects);
        for(String str:subjects){
            if (str.length() > 4) {
                subjects.remove(str);
            }
        }

        */



