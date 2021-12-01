package com.syntax.class24.task2;

public interface Shape {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
     */
    void calculateArea();
    void calculatePerimeter();

}
class Circle implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("The area of a Circle is Pi times the radius squared");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The Perimeter of Circle is calculated using the formula Pi x diameter");
    }
}
class Square implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("To find area of Square you need to find the length of one of the sides and then multiply this by itself ");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Since all the sides of a Square are equal, the perimeter of square will be 4 times its side");

    }
}
