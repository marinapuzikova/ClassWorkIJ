package com.syntax.class26;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {


    TreeSet<String> treeSet = new TreeSet<>();//maintain the alphabetical oder
        treeSet.add("X");
        treeSet.add("A");
        treeSet.add("Y");

        System.out.println(treeSet);
}
}
