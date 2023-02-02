package com.jspider.designpattern.task1;

public class Account {

	double accountBalance;
	int noOfObject=10000;
	
	public Account(int accountBalance) {
		super();
		this.accountBalance=accountBalance;
	}
	
	public void deposit(int depositAmount) {
		System.out.println("Depositing "+depositAmount+" rupees in the Account");
		accountBalance += depositAmount;
		System.out.println("Available Balance: "+accountBalance);
	}
	public void withdraw(int withdrawAmount) {
		if (accountBalance >= withdrawAmount) {
			System.out.println("Withdrawing "+withdrawAmount+" from the Account");
			accountBalance -= withdrawAmount;
			System.out.println("Available Balance: "+accountBalance);
		}else {
			System.out.println("Insufficient Balance");
		}
		
	}
}
