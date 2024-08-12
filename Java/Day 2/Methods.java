package com.sample;

public class Methods {
	void myMethod1() {
		System.out.println("Instance or object method");
	}
	static void myMethod2() {
		System.out.println("Static or class method");
	}

	public static void main(String[] args) {
		Methods obj = new Methods();
		obj.myMethod1();
		
		Methods.myMethod2();
	}
}
