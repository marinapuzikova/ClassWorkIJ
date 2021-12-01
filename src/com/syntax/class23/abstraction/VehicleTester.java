package com.syntax.class23.abstraction;

public class VehicleTester {
    public static void main(String[] args) {

        BMW bmw = new BMW("123", "Sedan", "BMD", "x5");
        bmw.printVehicle();
        bmw.speed();
        bmw.start();
        bmw.drive();
        bmw.stop();
        BMW bmw2 = new BMW("123", "Sedan", "BMD", "x5");
        bmw2.printVehicle();
    }
    Vehicle toyota=new Toyota("345","Sedan","Toyota","s6");
}
