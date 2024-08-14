package com.sample;
class Vehicle{
	void drive(){

	}
}
class Car extends Vehicle{
	void drive() {
		System.out.print("Repairing a car");
	}
}
public class Repair {
	public static void main(String[] args) {
		Car c = new Car();
		c.drive();
	}
}
