package com.capgemini.exception.model;

import com.capgemini.exception.exceptionclasses.FactorialException;
import com.capgemini.exception.exceptionclasses.InvalidInputException;

public class Factorial {

	public long factorialNumber(int number) throws InvalidInputException, FactorialException {

		long factorial = 0;
		if (number < 2)
			throw new InvalidInputException("Number should be greater than 2");

		else {
			for (int iterator = number; iterator >= 1; iterator--) {
				factorial=number*factorial;
				if(factorial > Integer.MAX_VALUE)
				{
					throw new FactorialException("Fatorial reached the highest value");
				}

			}
		}
		
		return factorial;
	}

}
