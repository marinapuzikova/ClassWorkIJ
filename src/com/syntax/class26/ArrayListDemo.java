package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
                //we  specify a class--> <Fruit>
        ArrayList<Fruit> fruits = new ArrayList<>();
                    //we specifie type of object we want to eat to Array
        fruits.add(new Apple());
        fruits.add(new Orange());
        for (Fruit f : fruits) {
            f.printName();
        }
    }

}

class Fruit {
    void printName() {
        System.out.println("I am a fruit");
    }
}

class Apple extends Fruit {
    void printName() {
        System.out.println("I am an apple");
    }
}

class Orange extends Fruit {

    void printName() {
        System.out.println("I am an orange");
    }
}