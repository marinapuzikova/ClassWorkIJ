package com.syntax.groupProject.task3;

public class Car {
    /*
    Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice()
    which should be returning a price of the car.
    Create 2 sub classes: Sedan and Truck. The Truck class has field as weight
    and has its own implementation of  calculateSalePrice() method in which returned price calculated as following:
    if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
    The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
    if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
     */
    double carPrice;



    public Car(double carPrice) {
        this.carPrice = carPrice;

    }

    public double calculateSalePrice() {
        return carPrice;
    }
}

class Truck extends Car{
    double weight;

    public Truck(double carPrice,  double weight) {
        super(carPrice);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {//short hand operator
        return this.weight > 2000 ? super.carPrice - (super.carPrice * 0.1) : super.carPrice - (super.carPrice * 0.2);
    }
}
class Sedan extends Car{
    double length;

    public Sedan(double carPrice,  double length) {
        super(carPrice);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {//we are using short hand operator
        return this.length > 20 ? super.carPrice - (super.carPrice * 0.05) : super.carPrice - (super.carPrice * 0.1);
        }
    }


