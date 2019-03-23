package com.capgemini.exception.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.exception.exceptionclasses.InavlidDayException;
import com.capgemini.exception.exceptionclasses.InvalidMonthException;
import com.capgemini.exception.model.DateException;

public class DateTest {
	
	DateException date1;
	DateException date2;
	DateException date3;
	DateException date4;
	DateException date5;
	DateException date6;
	DateException date7;

	@Before
	public void setUp()
	{
		date1=new DateException();
		date2=new DateException();
		date3=new DateException();
		date4=new DateException();
		date5=new DateException();
		date6=new DateException();
		date7=new DateException();
	
	}
	
	@Test
	public void testDefaultConstructorIsInitializes() {
		
	DateException date1 = new DateException();	
	assertNotNull(date1);	
		
	}
	
	//true conditions 
	
	@Test(expected=InavlidDayException.class)
	public void testParameterisedConstructorIsInitialized() throws InavlidDayException , InvalidMonthException{
		 date1=new DateException(31 , 02 , 2018);
		
	
	}
	
   //leap year condition
	@Test(expected=InavlidDayException.class)
	public void testParameterisedConstructorIsInitialized1() throws InavlidDayException , InvalidMonthException{
		 date2=new DateException( 29, 02 , 2001);
		
	
	}
	
	//invalid 
	@Test(expected=InavlidDayException.class)
	public void testParameterisedConstructorIsInitialized2() throws InavlidDayException , InvalidMonthException {
		 date3=new DateException(29 , 02 , 2017);
		
	}
	
	//Invalid month
	@Test(expected=InvalidMonthException.class)
	public void testParameterisedConstructorIsInitialized3() throws InavlidDayException , InvalidMonthException {
		 date4=new DateException(30 , 13 , 2017);
		
	}
	
	
	//Invalid Month
	@Test(expected=InvalidMonthException.class)
	public void testParameterisedConstructorIsInitialized4() throws InavlidDayException , InvalidMonthException {
		 date5=new DateException(30 , 15 , 2017);
		
	}
	
	
	
	//invalid month
	
	/*@Test(expected=InvalidMonthException.class)
	public void testSetMonth() throws InvalidMonthException
	{
		date1.setMonth(13);
		
	}*/
	
	
}
