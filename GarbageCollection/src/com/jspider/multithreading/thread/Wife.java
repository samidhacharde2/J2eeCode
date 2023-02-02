package com.jspider.multithreading.thread;

import com.jspider.multithrading.resource.Account;

public class Wife {
Account account;

public Wife(Account account) {
	super();
	this.account=account;
}
private void run() {
	account.deposit(3000);
    account.withdraw(8000);
}

public void start() {
	run();
}
}
