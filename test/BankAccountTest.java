package com.capgemini.exception.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.exception.exceptionclasses.WithdrawAmountException;
import com.capgemini.exception.model.BankAccount;

public class BankAccountTest {

	BankAccount bankAccount;

	@Before
	public void stUp() {
		bankAccount = new BankAccount(101, "Shachi", "Saving", 45000.0);
	}
	
	@Test(expected=WithdrawAmountException.class)
	public void testWithdrawWithInsufficientBaalace() throws WithdrawAmountException
	{
		assertEquals(45000.0, bankAccount.withdraw(50000.0),0.1);
		
	}

	
}
