package com.sample;

public class MethodOverloading {
	void method(String name) {
		System.out.println("Welcome "+name);
	}
	
	void method(int a, int b) {
		System.out.println("Addition: "+(a+b));
	}
	
	void method(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact *= i;
		}
		System.out.print("Factorial of "+n+" is "+fact);
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.method("Dheetchanaa");
		obj.method(2,3);
		obj.method(5);
		
	}
}
