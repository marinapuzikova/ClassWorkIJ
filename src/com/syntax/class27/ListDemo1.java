package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Ferrari");
        cars.add("Ferrari");
        cars.add("Mercedes");
        cars.add(1,"Toyota");
        Iterator<String> iterator =cars.iterator();
        //hasNext() returns true if there are still any elements in Iterator
        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }
        iterator =cars.iterator(); //getting the new fresh iterator again
        System.out.println("********************");
        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }

    }

}
