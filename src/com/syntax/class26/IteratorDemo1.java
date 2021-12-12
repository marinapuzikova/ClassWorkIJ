package com.syntax.class26;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<String>subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        Iterator<String>iterator=subjects.iterator();
        System.out.println(iterator.hasNext());//it tells you if there are any elements left in iterator
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        iterator.next();
        iterator.remove();//whichever element we grabbed will be removed
        //System.out.println(iterator.next());
       // iterator.remove();
        System.out.println(subjects);
        //System.out.println(iterator.hasNext());
        //System.out.println(iterator.next());
    }
}
