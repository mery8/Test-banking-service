package com.banque.service;

import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.banque.interfaces.AccountService;
import com.banque.models.Account;
import com.banque.models.Operation;


public class AccountServiceImpl implements AccountService  {
    Account account = new Account() ;
      
	@Override
	public void deposit(int amount) {
		
		account.setSolde(account.getSolde()	+amount);
		int soldeOpperation = account.getSolde() ;

		account.getOperations().add(new Operation(amount, "deposit", soldeOpperation));
		
		
 	}

	@Override
	public void withdraw(int amount) {		
	if(amount > account.getSolde()) {
		return;
	}
	
	
	int soldeOpperation = account.getSolde() -amount;
	account.setSolde(soldeOpperation);
	account.getOperations().add(new Operation(amount,  "withdraw",soldeOpperation ));
        
        }

	@Override
	public void printStatement() {
		System.out.println( "Date"+ "        ||"+"Amount"+"||  " +"Balance ");

		for(Operation op : account.getOperations()) {
			String sign = "withdraw".equals(op.getTypeOpetatiopn())? "-":"";
	        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        String dateOperation = format.format(op.getDateOperation());
	        
			System.out.println( dateOperation+ "  || "+sign+op.getAmount() +"  || "+ op.getSolde());
		}
	}

}
