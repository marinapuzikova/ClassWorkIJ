package com.syntax.class22.task1;

public class StudentTester {
    public static void main(String[] args) {
        Student []students={new CollegeStudent(), new SyntaxStudent(), new SchoolStudent()};
        for(Student s:students){
            s.study();
            s.doHomeWork();
            s.practice();

            if(s instanceof SyntaxStudent){
                ((SyntaxStudent)s).doResearch();
            }
        }
    }
}
