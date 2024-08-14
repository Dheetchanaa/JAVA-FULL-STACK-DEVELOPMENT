package com.sample;

class BankAccount{
	String accno;
	int balance;
	BankAccount(String accno,int balance)
	{
		this.accno=accno;
		this.balance=balance;
	}
	void deposit(int amount) {
		balance+=amount;
	}
	void withdraw(int amount) {
		if(balance<amount)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			balance=balance-amount;
			System.out.println("Balance Amount : "+balance);
		}
	}
}

class SavingsAccount extends BankAccount{
	SavingsAccount(String accno,int balance){
		super(accno,balance);
	}
	void withdraw(int amount) {
		if((balance-amount)<100)
		{
			System.out.println("Minimum amount $100 Required");
		}
		else {
			super.withdraw(amount);
			System.out.println("Balance amount : "+balance);
		}
	}
}

public class BankAccountMain {
	public static void main(String args[])
	{
		BankAccount b = new BankAccount("IOB1000028",2500);
		b.deposit(500);
		b.withdraw(500);
		SavingsAccount s = new SavingsAccount("IOB1000038",1000);
		s.withdraw(1000);
	}
}
