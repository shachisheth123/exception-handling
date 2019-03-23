package com.capgemini.exception.model;

import com.capgemini.exception.exceptionclasses.WithdrawAmountException;

public class SavingAccount extends BankAccount{
	
	public static final double MINIMUM_BALANCE = 10000;

	public boolean isSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(boolean salaryAccount) {
		this.salaryAccount = salaryAccount;
	}

	private boolean salaryAccount;

	public SavingAccount(int accountId, String accountholderName, String accountType, double accountBalance,
			boolean salaryAccount) {
		super(accountId, accountholderName, accountType, accountBalance);
		this.salaryAccount = salaryAccount;
	}

	@Override
	public double withdraw(double amount) throws WithdrawAmountException {
		if (salaryAccount) {
			return super.withdraw(amount);
		} else {
			if (getAccountBalance() - amount >= MINIMUM_BALANCE)
				setAccountBalance(getAccountBalance() - amount);
			else
				throw new WithdrawAmountException("You dont have sufficient balance");
			return getAccountBalance();
		}
	}

}
