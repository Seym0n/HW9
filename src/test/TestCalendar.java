package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.GregorianCalendar;

class TestCalendar {
	
	GregorianCalendar gregCalendar = new GregorianCalendar();

	// Exercise 1
	
	@ParameterizedTest
	@ValueSource(ints = {1902, 1933, 1936, 1981, 1992})
	public void Should_check_if_year_is_leap_also_in_gregorian(int year) {
		Calendar calendar = new Calendar(year);
		boolean expectedResult = gregCalendar.isLeapYear(year);
		boolean actualResult = calendar.isLeapYear();
		
		assertEquals(expectedResult, actualResult);
	}

// Implement test cases for the equivalent partitions 
	
	@Test
	public void TestCaseOne() {
		Calendar calendar = new Calendar(1904);
		assertTrue(calendar.isLeapYear());
	}
	
	@Test
	public void TestCaseTwo() {
		Calendar calendar = new Calendar(1850);
		assertFalse(calendar.isLeapYear());
	}
	
	@Test
	public void TestCaseThree() {
		Calendar calendar = new Calendar(2010);
		assertFalse(calendar.isLeapYear());
	}


}
