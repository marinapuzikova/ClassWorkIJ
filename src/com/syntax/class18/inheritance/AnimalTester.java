package com.syntax.class18.inheritance;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.name="Boby";//instance fieild
        dog.bark();
        dog.eat();//can call method from parent class->common method

        Cat cat=new Cat();
        cat.name="Texy";
        cat.meow();
        System.out.println(dog.name);
    }
}
