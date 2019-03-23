package com.capgemini.exception.model;

import com.capgemini.exception.exceptionclasses.AgeNotWithinRangeException;
import com.capgemini.exception.exceptionclasses.NameNotValidException;

public class StudentException {
	private String studentName;
	private int studentAge;
	private String course;
	private int rollNo;

	public StudentException(int rollNo, String studentName, int studentAge, String course)
			throws AgeNotWithinRangeException, NameNotValidException {
		super();
		this.rollNo = rollNo;
		if (studentName.matches("^[a-zA-Z]*$")) {
			this.studentName = studentName;
		}
		else
		{
			throw new AgeNotWithinRangeException("Name is not valid");
		}
		this.course = course;
		if (studentAge >= 15 && studentAge <= 21) {
			this.studentAge = studentAge;}
		else
		{
			throw new AgeNotWithinRangeException("Enter alphabets only");
		}

	}

	public StudentException() throws AgeNotWithinRangeException, NameNotValidException {

	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) throws NameNotValidException {
		if (studentName.matches("^[a-zA-Z]*$"))
			this.studentName = studentName;
		else
			throw new NameNotValidException("Name should contain only alphabets");
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) throws AgeNotWithinRangeException {
		if (studentAge >= 15 && studentAge <= 21)
			this.studentAge = studentAge;
		else
			throw new AgeNotWithinRangeException("Not within limit");
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void ageNotWithinLimit() throws AgeNotWithinRangeException {

		if (studentAge >= 15 && studentAge <= 21)
			System.out.println("Valid Age");
		else
			throw new AgeNotWithinRangeException("age not within limit");
	}

}
