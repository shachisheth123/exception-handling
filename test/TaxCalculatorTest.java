package com.capgemini.exception.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.exception.exceptionclasses.CountryNotValidException;
import com.capgemini.exception.exceptionclasses.EmployeeNameInvalidException;
import com.capgemini.exception.model.TaxCalculator;

public class TaxCalculatorTest {

	TaxCalculator taxcal;

	@Before
	public void setUp() {

		taxcal = new TaxCalculator();
	}

	@Test(expected = CountryNotValidException.class)
	public void testCalculateTax()
			throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
	
		taxcal.calculateTax("Ron", false, 34000);
	}
	
	@Test(expected=EmployeeNameInvalidException.class)
	public void testCalculateTaxName() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{
		
		taxcal.calculateTax( " " , true, 30000);
	}

}
