package com.sample;

class Employee2{
	int salary;
	Employee2(int salary){
		this.salary=salary;
	}
	void work() {
		System.out.println("Working as an employee :");
	}
	void getSalary() {
		System.out.println(salary);
	}
}

class HRManager extends Employee2{
	HRManager(int salary) {
		super(salary);
	}
	void work() {
		System.out.println("Working as Manager :");
	}
	void addEmployee() {
		System.out.println("Adding new Employee.");
	}
}
public class BankMain {
	public static void main(String args[]) {
		Employee2 e = new Employee2(5000);
		e.work();
		e.getSalary();
		HRManager m = new HRManager(10000);
		m.work();
		m.getSalary();
		m.addEmployee();
	}
}
