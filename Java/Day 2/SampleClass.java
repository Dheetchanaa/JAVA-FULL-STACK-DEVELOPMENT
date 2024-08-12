package com.sample;
class Employee{
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	Employee(int employeeId, String employeeName, float employeeSalary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	void display() {
		System.out.println("Employee id: "+employeeId);
		System.out.println("Employee name: "+employeeName);
		System.out.println("Employee salary: "+employeeSalary);
	}
}
public class SampleClass {
	public static void main(String[]args) {
		Employee obj1 = new Employee(101,"Dhee",50000.50f);
		obj1.display();
		Employee obj2 = new Employee(102,"Priya",70000.550f);
		obj2.display();
	}
}
