package com.syntax.class22.example2;

public class Person {
    String name;
    Person(String name){
        this.name=name;
    }
    void eat(){
        System.out.println(name+" eating");
    }
    void performDailyTasks(){
        System.out.println("Eat sleep repeat");
    }
}
class Employee extends Person{
    Employee(String name){//i must provide matching constructor in child class
        super(name);
    }
    void performDailyTasks(){//i override behavior and provide my own implementation
        System.out.println("Working all the day in office and reading emails at night");
    }
}
class Student extends Person{
    Student(String name){// matching constructor
        super(name);
    }
    void performDailyTasks(){
        System.out.println("Attending the classes at day reading at night");
    }
}
class Teacher extends Person{
    Teacher(String name){
        super(name);
    }
    void performDailyTasks(){
        System.out.println("Giving homeworks a day party at night");
    }
    void designClasses(){
        System.out.println("Create repls and design new classes");
    }
}
