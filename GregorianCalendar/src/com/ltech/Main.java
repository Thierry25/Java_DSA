package com.ltech;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.printf("The year is %s, the month %s and the day %s\n"
                ,gregorianCalendar.get(GregorianCalendar.YEAR)
                ,gregorianCalendar.get(GregorianCalendar.MONTH)
                ,gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
