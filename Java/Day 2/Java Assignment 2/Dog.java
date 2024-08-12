package com.sample;

public class Dog {
	String name;
	String breed;
	Dog(String name, String breed){
		this.name = name;
		this.breed = breed;
	}
	void setter(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	void display() {
		System.out.println("Name :"+name);
		System.out.println("Breed :"+breed);
		System.out.println();
	}
	public static void main(String[] args) {
		Dog obj1 = new Dog("Tommy", "Combai");
		obj1.setter("Charlie","Beagle");
		obj1.display();
		Dog obj2 = new Dog("Tommy", "Labrador");
		obj2.setter("Buddy","Pug");
		obj2.display();
	}
}
