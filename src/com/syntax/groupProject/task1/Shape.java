package com.syntax.groupProject.task1;

public interface Shape {
    /*
   Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
   Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
    */
    double radius=10.5;
    double x=5;
    void calculateArea();
    void calculatePerimeter();

}
class Circle implements Shape {
    @Override
    public void calculateArea() {
        System.out.println("The Area of a Circle is " + Math.PI*Math.pow(radius,2));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The Perimeter of Circle is "+ Math.PI*2*radius);
    }
}
class Square implements Shape {
    @Override
    public void calculateArea() {
        System.out.println("The Area of Square is "+ Math.pow(x,2));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The Perimeter of the square is "+4*x);

    }
}
