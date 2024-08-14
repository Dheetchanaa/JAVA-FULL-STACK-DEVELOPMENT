package com.sample;

class TwoWheeler{
	
	void noOfWheels() {
		System.out.println("I hava two Wheels");
		
	}
}

class Bike extends TwoWheeler{
	
	void brandName() {
		System.out.println("Brand Name is Honda");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.noOfWheels();
		bike.brandName();
	}

}