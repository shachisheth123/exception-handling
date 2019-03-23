package com.capgemini.exception.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.exception.exceptionclasses.WithdrawAmountException;
import com.capgemini.exception.model.SavingAccount;

public class SavingAccountTest {
	@Test
	public void testWithdrawWithSavingSufficientBalance() throws WithdrawAmountException {
		SavingAccount savingAccount = new SavingAccount(101, "Shachi", "Saving", 15000.0, true);
		assertEquals(10000.0, savingAccount.withdraw(5000.0), 0.1);

	}

	@Test(expected = WithdrawAmountException.class)
	public void testWithdrawWithSavingInSufficientBalance() throws WithdrawAmountException {
		SavingAccount savingAccount = new SavingAccount(101, "Shachi", "Saving", 15000.0, true);
		assertEquals(15000.0, savingAccount.withdraw(25000.0), 0.1);

	}

	

	@Test(expected = WithdrawAmountException.class)
	public void testWithdrawWithSavingAccountWithInsufficientBalance() throws WithdrawAmountException {
		SavingAccount savingAccount = new SavingAccount(101, "Shachi", "Saving", 15000.0, true);
		assertEquals(15000.0, savingAccount.withdraw(35000.0), 0.1);

	}

}
