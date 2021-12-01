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
    String color;
    Car(){
    }

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice() {
        return carPrice;
    }
}

class Truck extends Car{
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        if(this.weight>2000){
            return super.carPrice-(super.carPrice*0.1);
        }else{
            return super.carPrice-(super.carPrice*0.2);
        }
    }
}
class Sedan extends Car{
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
        if(this.length>20){
            return super.carPrice-(super.carPrice*0.05);
        }else{
            return super.carPrice-(super.carPrice*0.1);
            }
        }
    }


