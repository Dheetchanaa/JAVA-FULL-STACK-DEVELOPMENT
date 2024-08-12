package com.sample;

public class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age :"+age);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Person obj1 = new Person("Dhee", 20);
		obj1.display();
		Person obj2 = new Person("Priya", 21);
		obj2.display();
	}
}
