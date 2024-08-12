package com.sample;

public class Rectangle {
	int width;
	int height;
	int area;
	int perimeter;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	void calculate() {
		this.area = (width*height);
		this.perimeter = (2*(width+height));
	}
	void display() {
		System.out.println("Area :"+area);
		System.out.print("Perimeter :"+perimeter);
	}
	public static void main(String[] args){
		Rectangle obj = new Rectangle(10,5);
		obj.calculate();
		obj.display();
	}
}