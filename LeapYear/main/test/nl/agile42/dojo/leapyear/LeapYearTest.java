package nl.agile42.dojo.leapyear;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LeapYearTest {

	LeapYear leapYear;
	
	@Before
	public void setup() {
		leapYear = new LeapYear();
	}
	
	@Test
	public void testSpecialLeapYear() {
		assertTrue("Test that 2000 is a leap year", leapYear.isLeapYear(2000));
		assertTrue("Test that 2400 is a leap year", leapYear.isLeapYear(2400));
	}
	
	@Test
	public void testSpecialCommonYear() {
		assertFalse("Test that 1900 is a leap year", leapYear.isLeapYear(1900));
		assertFalse("Test that 2100 is a leap year", leapYear.isLeapYear(1900));
	}
	
	@Test
	public void testLeapYear() {
		assertTrue("Test that 2004 is a leap year", leapYear.isLeapYear(2004));
		assertTrue("Test that 1996 is a leap year", leapYear.isLeapYear(1996));
	}
	
	@Test
	public void testCommonYears() {
		assertFalse("Test that 1995 is not a leap year", leapYear.isLeapYear(1995));
		assertFalse("Test that 2001 is not a leap year", leapYear.isLeapYear(2001));
	}

}
