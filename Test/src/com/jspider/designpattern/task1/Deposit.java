package com.jspider.designpattern.task1;

public class Deposit {
 
	Account account;
	private int accountBalance=10000;
	

	public Deposit(Account account) {
		super();
		this.account=account;
	}
	public Deposit(int i) {
		// TODO Auto-generated constructor stub
	}
	private void run() {
		account.deposit(3000);
	    account.withdraw(8000);
	}

	public void start() {
		run();
	}
	}

