package com.jspider.multithreading.thread;

import com.jspider.multithrading.resource.Account;

public class Husband {

	Account account;
	public Husband(Account account) {
		super();
		this.account=account;
	}
	private void run() {
		account.deposit(5000);
		account.withdraw(7000);
	}
	public void Start() {
		run();
	} 
}
