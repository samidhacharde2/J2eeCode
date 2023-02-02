package com.jspider.multithreading.main;

import com.jspider.multithrading.resource.Account;
import com.jspider.multithreading.thread.Husband;
import com.jspider.multithreading.thread.Wife;

public class AccountMain {

	public static void main(String[] args) {
		
		Account account=new Account(2000);
		
		Husband husband=new Husband(account);
		
		Wife wife=new Wife(account);
		
		husband.Start();
	    wife.start();
	}
}
