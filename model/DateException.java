package com.capgemini.exception.model;

import com.capgemini.exception.exceptionclasses.InavlidDayException;
import com.capgemini.exception.exceptionclasses.InvalidMonthException;

public class DateException {
	private int day;
	private int month;
	private int year;

	public DateException() {

	}

	public DateException(int day, int month, int year) throws InavlidDayException , InvalidMonthException {

		if (month == 2 || month == 02) {

			if (day < 28 && day > 0)

			this.day = day;
			
			else if (year % 4 == 0 && year % 400 == 0 && year % 100 == 0)
				
			 this.day=29;
			else
				throw new InavlidDayException("Enter valid day");

		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

			if (day < 31 && day > 0)

				this.day = day;

			else

				throw new InavlidDayException("Enter valid day");

		}

		else if (month == 4 || month == 6 || month == 9 || month == 11) {

			if (day < 30 && day > 0)

				this.day = day;
		}
		
		else if (month >=1 && month <=12)
		{
			this.month=month;
			
		}
			else

				throw new InvalidMonthException("month is not valid");

		

	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) throws InvalidMonthException {
		/*
		 * (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month
		 * == 10 || month == 12) { System.out.println("month has 31 days"); } else if
		 * (month == 4 || month == 6 || month == 9 || month == 11) {
		 * System.out.println("\n 30 Days in this Month"); } else if (month == 2) {
		 * System.out.println("month is february"); } else if(year %4 == 0 && year % 100
		 * == 0 && year % 400 == 0) { this.day = 29;
		 * 
		 * } else throw new InvalidMonthException("Month is not valid");
		 * this.month=month;
		 */
		if (month >= 1 && month <= 12) {

			this.month = month;
		}
		else
			throw new InvalidMonthException("Invalid month");
	}
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		
		this.year = year;

	}

}
