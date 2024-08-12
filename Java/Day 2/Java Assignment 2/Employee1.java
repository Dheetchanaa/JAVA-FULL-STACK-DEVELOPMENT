package com.sample;

public class Employee1 {
		String name;
		String jobTitle;
		float salary;
		 
		 Employee1(String name, String jobTitle, float salary){
			 this.name=name;
			 this.jobTitle=jobTitle;
			 this.salary=salary;
			 
		 }
		 
		 void calculate(int amount) {
			 salary+=amount;
		 }
		 void display() {
			 System.out.println("Name : "+name);
			 System.out.println("JobTitle : "+jobTitle);
			 System.out.println("Salary : "+salary);
		 }
		 
		 public static void main(String[] args) {
			 Employee1 obj = new Employee1("Dhee","CEO",80000);
			 obj.calculate(20000);
			 obj.display();
		 }
}
