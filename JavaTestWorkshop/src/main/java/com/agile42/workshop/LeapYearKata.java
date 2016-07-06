package com.agile42.workshop;

/**
 * Created by niels on 06-07-16.
 */
public class LeapYearKata {

    public boolean isLeapYear(int year) {
        boolean status = false;

        if (year % 4 == 0) {
            status = true;
            if (year % 100 == 0) {
                status = false;
                if (year % 400 == 0) {
                    status = true;
                }
            }
        }
        return status;
    }
}
