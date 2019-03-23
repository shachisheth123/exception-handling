package com.capgemini.exception.model;

import com.capgemini.exception.exceptionclasses.WithdrawAmountException;

public class BankAccount {
	
	private int accountId;
	private String accountholderName;
	private String accountType;
	private double accountBalance;
	
	
	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountholderName() {
		return accountholderName;
	}

	public void setAccountholderName(String accountholderName) {
		this.accountholderName = accountholderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}


	public BankAccount(int accountId, String accountholderName, String accountType, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountholderName = accountholderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	
	public double withdraw(double amount) throws WithdrawAmountException {
		if(accountBalance>=amount)
			accountBalance=accountBalance-amount;
		else 
			throw new WithdrawAmountException("You dont have sufficient Balance");
		return accountBalance;
		
		}

	public double deposit(double amount) {
		accountBalance=accountBalance+amount;
		return accountBalance;
	}

}
