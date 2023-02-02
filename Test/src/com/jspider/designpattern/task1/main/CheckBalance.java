package com.jspider.designpattern.task1.main;

import com.jspider.designpattern.task1.Account;
import com.jspider.designpattern.task1.Deposit;
import com.jspider.designpattern.task1.Withdraw;

public class CheckBalance {
 
public static void main(String[] args) {
		
		Account account=new Account(200);
		
		Withdraw w=new Withdraw(account);
		w.start();
		
		Deposit d=new Deposit(account);
		d.start();
//		husband.Start();
//	    wife.start();
	}
}
