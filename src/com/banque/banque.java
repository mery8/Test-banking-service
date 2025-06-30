package com.banque;
import java.util.InputMismatchException;
//import java.util.InputMismatchException;
import java.util.Scanner;

import com.banque.interfaces.AccountService;
import com.banque.service.AccountServiceImpl;

public class banque {

	public static void main(String[] args) {
		AccountService as = new AccountServiceImpl();
	  //as.deposit(1000);
		//as.deposit(200);
		//as.deposit(100);
		//	as.withdraw(25);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuiller chosir le type d'opération \n Deposit \n withdraw" );
		String type = sc.nextLine();
		
		if(!("Deposit".equalsIgnoreCase(type.trim()) || "withdraw".equalsIgnoreCase(type))) {
		System.out.println("Veuiller saisir un type d'operation valide!");	
		sc.close();
		return;
		}
	
		
		System.out.println("Veuillez saisir le montant ");
		int amount = 0;
		try {
		 amount = sc.nextInt();
		}catch(Exception  e) {
			System.out.println("Veuillez entrer un nombre valide!");
			sc.close();
			return;
		}
      if("Deposit".equalsIgnoreCase(type.trim())) {
	       as.deposit(amount);
	
		}else if("withdraw".equalsIgnoreCase(type.trim())) {
			as.withdraw(amount);
		}

		
		as.printStatement();

	
	}

}
