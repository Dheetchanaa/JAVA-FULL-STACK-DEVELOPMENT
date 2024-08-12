package com.sample;

public class ConstructorOverloading {
	ConstructorOverloading(String name) {
		this(2,3);
		
		System.out.println("Welcome "+name);
		
	}
	
	ConstructorOverloading(int a, int b) {
		this(5);
		System.out.println("Addition: "+(a+b));
	}
	
	ConstructorOverloading(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact *= i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
	}
	
	public static void main(String[] args) {
		ConstructorOverloading obj = new ConstructorOverloading("Dheetchanaa");
	}
}