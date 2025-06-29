package com.banque;
import com.banque.interfaces.AccountService;
import com.banque.service.AccountServiceImpl;

public class banque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountService as = new AccountServiceImpl();
		as.deposit(100);
		as.deposit(200);
		as.deposit(100);
		as.withdraw(25);
		
		as.printStatement();

	}

}
