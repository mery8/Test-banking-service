package com.banque.models;

import java.util.ArrayList;
import java.util.List;

public class Account {
	List<Operation> operations = new ArrayList<>();
	private int solde;
	public List<Operation> getOperations() {
		return operations;
	}
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	

}
