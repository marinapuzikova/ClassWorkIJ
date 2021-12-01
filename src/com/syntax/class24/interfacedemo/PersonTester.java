package com.syntax.class24.interfacedemo;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new SDETInstructor();//i can only call those methods which person has
        person.eat();
        person.sleep();
        Employee employee=new SDETInstructor();
        employee.work();
        SyntaxEmployee syntaxEmployee=new SDETInstructor();
        syntaxEmployee.teach();
        syntaxEmployee.eat();
        syntaxEmployee.sleep();
        syntaxEmployee.work();
        SDETInstructor sdetInstructor=new SDETInstructor();
        sdetInstructor.eat();
        sdetInstructor.sleep();
        sdetInstructor.teach();
        sdetInstructor.work();
    }
}
