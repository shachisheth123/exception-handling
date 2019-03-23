package com.capgemini.exception.model;

import com.capgemini.exception.exceptionclasses.CountryNotValidException;
import com.capgemini.exception.exceptionclasses.EmployeeNameInvalidException;
import com.capgemini.exception.test.TaxNotEligibleException;

public class TaxCalculator {

	public TaxCalculator() {
		
		
	}
	
	public void calculateTax(String empName , boolean isIndian , double empSal) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{
		double taxAmount;
		isIndian=true;
		if(!isIndian )
		{
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
			
		}
		else if(empName.equals(null) && empName.equals(""))
				{
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}
		else if(empSal>100000 && isIndian)
		{
	
			taxAmount=empSal*8/100;
		}
			
		else if(empSal>=50000 && empSal<=100000 && isIndian)
		{
			taxAmount=empSal*6/100;
		}
			
		else if(empSal >= 30000 && empSal <=50000 && isIndian)
		{
			taxAmount=empSal*5/100;
		}
		else if(empSal >= 10000 && empSal <=30000 && isIndian)
		{
			taxAmount=empSal*4/100;
		}
		else
			throw new TaxNotEligibleException("The employee does not need to pay tax”\r\n");
					
	}
	
}
