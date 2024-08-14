package com.sample;

class Person1{
	String firstname;
	String lastname;
	Person1(String firstname,String lastname){
		this.firstname=firstname;
		this.lastname=lastname;
	}
	void getFirstName() {
		System.out.println(firstname);
	}
	void getLastName() {
		System.out.println(lastname);
	}
}

class Employee3 extends Person1{
	int Employeeid;
	String Jobtitle;
	Employee3(String firstname,String lastname,int Employeeid,String Jobtitle){
		super(firstname,lastname);
		this.Employeeid=Employeeid;
		this.Jobtitle=Jobtitle;
	}
	void employeeId() {
		System.out.println(Employeeid);
	}
	void getLastName() {
		System.out.println(Jobtitle);
	}
}
public class Person1Main {
	public static void main(String args[])
	{
		Person1 p = new Person1("Dheetchanaa","Kanagaraj");
		p.getFirstName();
		p.getLastName();
		Employee3 e = new Employee3("Dheetchanaa","Kanagaraj",101,"Engineer");
		e.employeeId();
		e.getLastName();
		
	}
}
