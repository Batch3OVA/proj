package com.bank;

public class Acnt 
{
	private long accountNo;
	private String name;
	private double balance; 
	
	public Acnt(long accountNo, String name,double balance) 
	{
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public long getAccountNo()
	{
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amt)
	{
		amt=balance+amt;
		this.balance=amt;
		
	}
	
	public void withdraw(double amt)
	{
		amt=balance-amt;
		this.balance=amt;
	}
	
	public void showDetails()
	{
		System.out.println("ACCOUNT NO:"+accountNo);
		System.out.println("NAME:"+name);
		System.out.println("BALANCE:"+balance);
	}
	
	
	
}

