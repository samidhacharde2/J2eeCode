package com.jspider.designpattern.task1;

public class Withdraw {
	Account account;
    private int accountBalance=10000;
	
    public Withdraw(Account account) {
		super();
		this.account=account;
	}
	public Withdraw(int i) {
	
	}
	private void run() {
		account.deposit(5000);
		account.withdraw(7000);
	}
	
	public void start() {
		run();
		
	} 
	}
