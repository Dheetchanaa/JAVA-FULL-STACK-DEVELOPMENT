package com.sample;

class Animal2{
	void move() {
		System.out.print("Animal runs...");
	}
}
class Cheetah extends Animal2{
	void move() {
		System.out.print("Cheetah runs...");
	}
}
public class AnimalMain {
	public static void main(String[] args) {
		Cheetah c = new Cheetah();
		c.move();
	}
}