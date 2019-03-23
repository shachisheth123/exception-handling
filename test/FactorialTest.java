package com.capgemini.exception.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.exception.exceptionclasses.FactorialException;
import com.capgemini.exception.exceptionclasses.InvalidInputException;
import com.capgemini.exception.model.Factorial;

public class FactorialTest {

	Factorial factorial;

	@Before
	public void setUp() {

		factorial = new Factorial();
	}

	@Test(expected = InvalidInputException.class)
	public void testInvalidNumberFactorial() throws InvalidInputException, FactorialException {
		factorial.factorialNumber(1);
	}

	@Test(expected = FactorialException.class)
	public void testFactorialWithHigherNumber() throws InvalidInputException, FactorialException {

		factorial.factorialNumber(888888888);
	}

	@Test
	public void testFactorialWithValidInput() throws InvalidInputException, FactorialException {
		assertEquals(120, factorial.factorialNumber(5));
	}
}
