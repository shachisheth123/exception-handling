package com.capgemini.exception.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.exception.exceptionclasses.AgeNotWithinRangeException;
import com.capgemini.exception.exceptionclasses.NameNotValidException;
import com.capgemini.exception.model.StudentException;

public class StudentExceptionTest {
	
	StudentException student;
	StudentException student1;
	
	@Before
	public void setUp() throws AgeNotWithinRangeException,NameNotValidException
	{
		
			student = new StudentException(101 , "Shachi123" , 24 ,"JAVA");
			student1=new StudentException();
	}

	@Test
	public void testStudentDefaultConstructorIsInitialized() throws AgeNotWithinRangeException, NameNotValidException 
	{
		
		StudentException student=new StudentException();
		assertNotNull(student);
	}
	
	
	@Test
	public void testStudentParameterisedConstrutor() throws AgeNotWithinRangeException, NameNotValidException {
		
		StudentException student = new StudentException(101,"Shachi" ,45 , "JAVA");
		assertNotNull(student);
		assertEquals(101,student.getRollNo());
		assertEquals("Shachi123", student.getStudentName());
		assertEquals(24, student.getStudentAge());
		assertEquals("JAVA", student.getCourse());
		
	}
	
	@Test(expected=AgeNotWithinRangeException.class)
	public void testAgeNotWithinLimit() throws AgeNotWithinRangeException {
		student1.setStudentAge(45);
			student.ageNotWithinLimit();
		
	}
	
	@Test(expected=AgeNotWithinRangeException.class)
	public void testSetStudentAge() throws AgeNotWithinRangeException
	{
		student1.setStudentAge(45);
	}
	
	@Test(expected=NameNotValidException.class)
	public void testSetStudentName() throws NameNotValidException
	{
		
		student1.setStudentName("Shachi123");
	}
	
	

}
