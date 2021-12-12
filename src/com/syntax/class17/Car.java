package com.syntax.class17;

public class Car {
	private String name;
	private String make;
	private String model;
	private String color;
	private int year;
	private int engineCC;
	private String VIN;
	private int mileage;
	private int MaxSpeed;
	private boolean sunroof;

	public Car() { // 0 parameter constructor

	}

	public Car(String carName) {
		name = carName;

	}

	public Car(String carName, String carMake, String carModel, String carColor) {
		name = carName;
		make = carMake;
		model = carModel;
		color = carColor;
	}

	public Car(String carName, String carMake, String carModel, String carColor, int carYear, int CarEngineCC,
			String carVin, int carMileage, int carMaxSpeed, boolean sunRoof) {
		name = carName;
		make = carMake;
		model = carModel;
		color = carColor;
		carYear = year;
		CarEngineCC = engineCC;
		VIN = carVin;
		mileage = carMileage;
		MaxSpeed = carMaxSpeed;
		sunroof = sunRoof;
	}

	public void printName() {
		System.out.println(name);
	}
	public void printColor() {
		System.out.println(color);
	}

	public void sayHello() {
		System.out.println("Hello");
	}
}
