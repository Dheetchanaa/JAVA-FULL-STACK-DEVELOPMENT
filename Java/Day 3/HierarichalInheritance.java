package com.sample;

class Vehicle1{
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}
class TwoWheeler1 extends Vehicle1{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}
class Bike1 extends TwoWheeler1{
	void brandName() {
		System.out.println("Brand name is Honda");
	}
}
class Scooty1 extends TwoWheeler1{
	void brandName() {
		System.out.println("Brand name is Activa");
	}
}
public class HierarichalInheritance {
	public static void main(String[] args) {
		Bike1 bike = new Bike1();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
		Scooty1 scooty = new Scooty1();
		scooty.noOfEngine();
		scooty.noOfWheels();
		scooty.brandName();
	}
}