package com.capgemini.exception.model;

import com.capgemini.exception.exceptionclasses.WithdrawAmountException;

public class CurrentAccount extends BankAccount{
	private double debitLimit;
	private double borrowedAmount;

	public double getDebitLimit() {
		return debitLimit;
	}

	public void setDebitLimit(double debitLimit) {
		this.debitLimit = debitLimit;
	}

	public double getBorrowedAmount() {
		return borrowedAmount;
	}

	public void setBorrowedAmount(double borrowedAmount) {
		this.borrowedAmount = borrowedAmount;
	}

	public CurrentAccount(int accountId, String accountholderName, String accountType, double accountBalance,double debitLimit) {
		super(accountId, accountholderName, accountType, accountBalance);
	this.debitLimit=debitLimit;

	}

	@Override
	public double withdraw(double amount) throws WithdrawAmountException {
		double temp = getAccountBalance() - amount;
		if (temp >= 0)
			setAccountBalance(temp);
		else if (Math.abs(temp) <= (debitLimit - borrowedAmount)) {
			setAccountBalance(0);
			borrowedAmount = borrowedAmount + Math.abs(temp);
		} else
		throw new WithdrawAmountException("You dont have sufficient balance");

		return getAccountBalance();
	}
	
	@Override
	public double deposit(double amount)
	{
		if(borrowedAmount == 0)
			return super.deposit(amount);
		else if(amount >= borrowedAmount) {
			setAccountBalance(amount - borrowedAmount);
			borrowedAmount = 0;			
		}
		else {
			borrowedAmount = borrowedAmount - amount;
		}
		return getAccountBalance();
	}

}
