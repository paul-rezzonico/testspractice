package testspractice;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class DateUtilsTest {

	@Test
	void should_be_a_PreJulianYear_before_1582_not_a_leap_year() {
		int date1 = 1163;
		int date2 = 1582;
		int date3 = 1500;
		int date4 = 1515;
		
		assertTrue(DateUtils.isPreJulianYear(date1));
		assertFalse(DateUtils.isLeapYear(date1));
		
		assertFalse(DateUtils.isPreJulianYear(date2));
		assertFalse(DateUtils.isLeapYear(date2));
		
		assertTrue(DateUtils.isPreJulianYear(date3));
		assertFalse(DateUtils.isLeapYear(date3));
		
		assertTrue(DateUtils.isPreJulianYear(date4));
		assertFalse(DateUtils.isLeapYear(date4));
	}
	
	@Test
	void should_be_not_a_PreJulianYear_after_1582() {
		int date1 = 1600;
		int date2 = 1700;
		int date3 = 1800;
		int date4 = 1955;
		
		assertFalse(DateUtils.isPreJulianYear(date1));
		
		assertFalse(DateUtils.isPreJulianYear(date2));
		
		assertFalse(DateUtils.isPreJulianYear(date3));
		
		assertFalse(DateUtils.isPreJulianYear(date4));
	}
	
	@Test
	void should_be_a_leap_year_when_divisible_by_400() {
		int date1 = 1600;
		int date2 = 1700;
		int date3 = 2000;
		int date4 = 2400;
		
		assertTrue(DateUtils.isLeapYear(date1));
		
		assertFalse(DateUtils.isLeapYear(date2));
		
		assertTrue(DateUtils.isLeapYear(date3));
		
		assertTrue(DateUtils.isLeapYear(date4));
	}
	
	@Test
	void should_be_a_leap_year_when_divisible_by_4_but_not_by_100 () {
		int date1 = 1852;
		int date2 = 1968;
		int date3 = 1992;
		int date4 = 2016;
		
		assertTrue(DateUtils.isLeapYear(date1));
		
		assertTrue(DateUtils.isLeapYear(date2));
		
		assertTrue(DateUtils.isLeapYear(date3));
		
		assertTrue(DateUtils.isLeapYear(date4));
	 }
	
	@Test
	void should_not_be_a_leap_year_when_divisible_by_100_but_not_by_400 () {
		int date1 = 1700;
		int date2 = 1800;
		int date3 = 1900;
		int date4 = 2300;
		
		assertFalse(DateUtils.isLeapYear(date1));
		
		assertFalse(DateUtils.isLeapYear(date2));
		
		assertFalse(DateUtils.isLeapYear(date3));
		
		assertFalse(DateUtils.isLeapYear(date4));
	 }
	
	@Test
	void should_not_be_a_leap_year() {
		//TODO
	}

}

