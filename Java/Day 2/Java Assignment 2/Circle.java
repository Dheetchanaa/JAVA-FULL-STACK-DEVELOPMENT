package com.sample;

public class Circle {
	double radius;
	double area;
	double circumference;
	Circle(int radius){
		this.radius = radius;
	}
	void calculate() {
		this.area = 3.14*radius*radius;
		this.circumference = (2*(3.14*radius));
	}
	void display() {
		System.out.println("Area: "+ area);
	    System.out.print("Circumference: "+ circumference);
	}
	public static void main(String[] args){
		Circle obj = new Circle(10);
		obj.calculate();
		obj.display();
	}
}
