package com.syntax.class23.abstraction;

public abstract class Vehicle {
    // abstract not allowed with fields
    String vinNumber;
    static int totalVehicles;

    /* abstract Vehicle (){
    constructors not allowed with abstract

     }*/
    Vehicle(String vinNumber) {
        totalVehicles++;
        this.vinNumber = vinNumber;
        System.out.println("Grandpas constructor is called");
    }

    public void printVehicle() {
        System.out.println(totalVehicles + " Vehicle creating");
    }

    public void drive() {
        System.out.println(" Vehicle is driving ");
    }

    public void stop() {
        System.out.println("Vehicle stopping");
    }

    public abstract void start();
}

abstract class Car extends Vehicle {
    String carType;

    Car(String carType, String vinNumber) {
        super(vinNumber);
        this.carType = carType;
        System.out.println("Parent constructor is called");
    }

    @Override
    public void drive() {
        System.out.println(" Car is driving");
    }

    public abstract void speed();
}

class BMW extends Car {
    String make;
    String model;

    BMW(String vinNumber, String carType, String make, String model) {
        super(carType, vinNumber);
        this.make = make;
        this.model = model;
        System.out.println("BMW constructor");
    }

    @Override
    public void speed() {
        System.out.println("BMW can run 300km/H");

    }

    @Override
    public void start() {
        System.out.println("BMD can start using remote");
    }
}

class Toyota extends Car {
    String make;
    String model;


    Toyota(String vinNumber, String carType, String make, String model) {
        super(carType, vinNumber);
        this.make = make;
        this.model = model;
    }

    @Override
    public void speed() {
        System.out.println("BMW can run 300km/H");

    }

    @Override
    public void start() {
        System.out.println("BMD can start using remote");
    }

    void displayInfo() {
        System.out.println("we build " + make + " model " + model + " " + carType + " " + vinNumber);
    }
}
