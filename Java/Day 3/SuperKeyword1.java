package com.sample;

class A1{
	A1(){
		System.out.println("A");
	}
	A1(int a){
		this();
		System.out.println("A1");
	}
}
class B1 extends A1{
	B1(){
		super(10);
		System.out.print("B");
	}
	B1(int a){
		System.out.println("B1");
	}
}
public class SuperKeyword1 {
	public static void main(String[] args) {
		B1 b = new B1(5);
	}
}