package com.sample;

class Vehicles{
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}
class TwoWheelers extends Vehicles{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}
class Bikes extends TwoWheelers{
	void brandName() {
		System.out.println("Brand name is Honda");
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		Bikes bike = new Bikes();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
	}
}