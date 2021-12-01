package com.syntax.class24.task2;

public class ShapeTester {
    public static void main(String[] args) {


        Shape[] shapes = {new Circle(), new Square()};
        for (Shape s : shapes){
            s.calculatePerimeter();
            s.calculateArea();
        }
    }
}
