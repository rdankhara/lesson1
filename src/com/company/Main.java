package com.company;

import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import static java.util.concurrent.TimeUnit.DAYS;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Date birthDate = new Date(2000,01, 21);
        Date today = new Date();
        System.out.println(birthDate);
        System.out.println(today);

//        ChronoUnit.DAYS.between(birthDate, birthDate);
//
        //birthDate.until(endDate, DAYS);
    }
}
