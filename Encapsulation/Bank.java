package com.xworkz.corejava.Encapsulation;

public class Bank 
{
	private double balance;
	public void setbalance(double balance) {
		if(balance>20000)
		{
			System.out.println("balance is...");
			this.balance=balance;
		}
		else
			{
			System.out.println("insufficient balance");
			}
		
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
