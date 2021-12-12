package com.syntax.class26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet=new LinkedHashSet<>();//maintain the oder
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Apple");
        hashSet.add("Apple");
        System.out.println(hashSet);
        ArrayList<String>arrayList=new ArrayList<>(hashSet);
        System.out.println(arrayList);
        LinkedHashSet<String>hashSet2=new LinkedHashSet<>(arrayList);
    }
}
