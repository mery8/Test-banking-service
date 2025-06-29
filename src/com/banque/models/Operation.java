package com.banque.models;

import java.time.LocalDateTime;
import java.util.Date;


public class Operation {
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	private int amount;
	private LocalDateTime dateOperation;
	private String typeOpetatiopn;
	
	private int solde;
	public String getTypeOpetatiopn() {
		return typeOpetatiopn;
	}
	public void setTypeOpetatiopn(String typeOpetatiopn) {
		this.typeOpetatiopn = typeOpetatiopn;
	}
	
	public Operation(int amount, String type,int solde) {
		this.amount = amount;
		this.dateOperation = LocalDateTime.now();
		this.typeOpetatiopn= type;
		this.solde=solde;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public LocalDateTime getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(LocalDateTime dateOperation) {
		this.dateOperation = dateOperation;
	}

}
