package com.capgemini.exception.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.capgemini.exception.exceptionclasses.WithdrawAmountException;
import com.capgemini.exception.model.CurrentAccount;

public class CurrentAccounTest {
	CurrentAccount currentAccount;

	public void testDeposit() {
		currentAccount = new CurrentAccount(101, "shachi", "Current", 90000.0, 50000);

		assertEquals(92000.0, currentAccount.deposit(2000.0), 0.1);
	}

	@Test(expected = WithdrawAmountException.class)
	public void testWithdrawwithInsufficientUsingDebitAmount() throws WithdrawAmountException

	{
		currentAccount = new CurrentAccount(101, "shachi", "Current", 90000.0, 5000.0);
		assertEquals(90000, currentAccount.withdraw(100000.0), 0.1);
		assertEquals(0.0, currentAccount.getBorrowedAmount(), 0.1);
	}

	@Test
	public void testDepositWithZeroDebitAmount() {
		currentAccount = new CurrentAccount(101, "John Doe", "Current", 90000.0, 50000.0);
		assertEquals(95000, currentAccount.deposit(5000), 0.1);
	}

}
