package com.agile42.workshop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by niels on 06-07-16.
 */
public class LeapYearKataTest {
    private LeapYearKata leapYearKata = null;

    @org.junit.Before
    public void setUp() throws Exception {
        leapYearKata = new LeapYearKata();
    }

    @Test
    public void is1996LeapYear() {
        assertTrue("1996 is leap year", leapYearKata.isLeapYear(1996));
    }


    @Test
    public void is2001NotLeapYear() {
        assertFalse("2001 is not a leap year", leapYearKata.isLeapYear(2001));
    }

    @Test
    public void is1992LeapYear() {
        assertTrue("1992 is a leap year", leapYearKata.isLeapYear(1992));
    }

    @Test
    public void is1900notLeapYear() {
        assertFalse("1900 is not a leap year", leapYearKata.isLeapYear(1900));
    }

    @Test
    public void is2000aLeapYear() {
        assertFalse("1900 is not a leap year", leapYearKata.isLeapYear(1900));
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }
}
