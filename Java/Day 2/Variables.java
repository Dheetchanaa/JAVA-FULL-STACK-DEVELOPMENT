package com.sample;

public class Variables {
	int b = 20;
	static int c = 30;
	
	public static void main(String[] args) {
		int a = 10;
		System.out.println("Local variable: "+a);
		
		Variables obj1 = new Variables();
		System.out.println(obj1.b);
		
		System.out.println(Variables.c);
	}
}
