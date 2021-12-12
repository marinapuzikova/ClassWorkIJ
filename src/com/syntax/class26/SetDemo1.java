package com.syntax.class26;

import java.util.HashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        //HashSet is super fast
        HashSet<String>hashSet=new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Apple");
        hashSet.add("Apple");
        hashSet.add("null");
        System.out.println(hashSet);//HashSet doesn't allow duplication ,"Apple" will appear only once
    }
}
