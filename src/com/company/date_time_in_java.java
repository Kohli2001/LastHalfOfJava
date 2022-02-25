package com.company;

import java.util.Calendar;
import java.util.Date;

public class date_time_in_java {
    public static void main(String[] args) {
//        System.out.println("number of hours since 1970  is : "  +System.currentTimeMillis()/1000/3600);
//        System.out.println("number of the year since 1970 is: "  +System.currentTimeMillis()/1000/3600/24/365);


        //quick quize---->>> is it safe to use long to print milisecond in java?
        //ANS --->>>>> YES ITS TOTALLY SAFE .
//
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());

        //THE DATE CLASS IN JAVA

//        Date d = new Date();
//        System.out.println(d);
//        Date dt = new java.sql.Date(2022,12,16);
//        System.out.println(dt);

        //Calendar class

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());

    }
}
