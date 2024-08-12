package com.sample;
import java.util.*;
class Account
{
	String userName;
	String userAccNo;
	
	Account(String userName,String userAccNo)
	{
		this.userName=userName;
		this.userAccNo=userAccNo;
		
	}

}
public class Bank {

	HashMap<String,Double> acc=new HashMap<>();
	double balance=0.0;
	void addAccount(String accNo)
	{
		if(!acc.containsKey(accNo))
		{
			acc.put(accNo,this.balance);
			System.out.println("Account added");
		}
		else
			System.out.println("Account already exists");
	}
	void deleteAccount(String accNo)
	{
		if(acc.containsKey(accNo))
			acc.remove(accNo);
		else
			System.out.println("No account found");
	}
	void deposit(String accNo,double mon)
	{
		if(acc.containsKey(accNo)) {
			System.out.println("Before Deposit: ");
			this.getBalance(accNo);
		    acc.put(accNo, acc.get(accNo)+mon);
		    System.out.println("After Deposit: ");
			this.getBalance(accNo);
		}
		else
		{
			System.out.println("Don't have account");
		}
	}
	void withdraw(String accNo,double mon)
	{
		if(acc.containsKey(accNo) && acc.get(accNo)>mon) {
			System.out.println("Before Withdraw: ");
			this.getBalance(accNo);
		    acc.put(accNo, acc.get(accNo)-mon);
		    System.out.println("After Withdraw: ");
			this.getBalance(accNo);
		}
		else
		{
			System.out.println("Balance: "+acc.get(accNo));
		}
		
	}
	void getBalance(String accNo)
	{
		System.out.println("Account Number: "+accNo);
		System.out.println("Balance : "+acc.get(accNo));
	}
	
	public static void main(String[] args) {
		Account acc=new Account("Samuvel","289939");
		Bank b=new Bank();
		b.addAccount(acc.userAccNo);
		b.deposit(acc.userAccNo, 40030);
		
		b.withdraw(acc.userAccNo, 100);
		        
	}

}