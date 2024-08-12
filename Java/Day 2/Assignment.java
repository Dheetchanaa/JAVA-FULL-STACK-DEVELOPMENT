package com.sample;
import java.util.Scanner;
class Student{
	int regNumber;
	String studName;
	int subjects[] = new int[5];
	
	Student(int regNumber, String studName) {
		this.regNumber = regNumber;
		this.studName = studName;
	}
	void getMarks() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			subjects[i] = sc.nextInt();
		}
	}
	void displayGrade() {
		System.out.println("Register Number: "+this.regNumber);
		System.out.println("Student name: "+this.studName);
		System.out.print("Subject Marks: ");
		for(int i=0;i<5;i++) {
			System.out.print(subjects[i]+" ");
		}
		System.out.println();
		int sum = 0;
		for(int i=0;i<5;i++) {
			sum+=subjects[i];
		}
		float avg = sum/5;
		System.out.println("Sum of all marks:" + sum);
		System.out.println("Average of all marks:" + avg);
		if(avg>=90 && avg<=100) {
			System.out.print("Grade : O");
		}
		else if(avg>=80 && avg<90) {
			System.out.print("Grade : A");
		}else if(avg>=60 && avg<80) {
			System.out.print("Grade : B");
		}else if(avg>=40 && avg<60) {
			System.out.print("Grade : C");
		}else {
			System.out.print("Grade : U");
		}
	}
}
public class Assignment {
	public static void main(String[] args) {
		Student obj = new Student(101,"Dhee");
		obj.getMarks();
		obj.displayGrade();
	}
}
