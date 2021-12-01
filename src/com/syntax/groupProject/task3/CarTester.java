package com.syntax.groupProject.task3;

public class CarTester<car> {
    public static void main(String[] args) {
        Car truck = new Truck(25000, "red", 1900);
        System.out.println("Final Truck price is " + truck.calculateSalePrice()+" $");
        Car sedan = new Sedan(32000, "black", 21);
        System.out.println("Final Sedan price is: " + sedan.calculateSalePrice()+" $");
    }
}


