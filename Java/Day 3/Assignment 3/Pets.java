package com.sample;

class Animal{
	void makeSound(){
		
	}
}

class Cat extends Animal{
	
	void makeSound() {
		System.out.println("meows");
	}
}

public class Pets {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.makeSound();
	}
}