package com.company;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTimeFormatter {
    public static void main(String[] args) {

        // its print local time and date without any formatting

        LocalDateTime ld = LocalDateTime.now();
        System.out.println(ld);

        // its print date and time but in a  formate

//        DateTimeFormatter df =  DateTimeFormatter.ofPattern("dd/mm/yyyy");
//        String time = ld.format(df);

        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/mm/yyy --- a");
        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd/mm/yyy --- E");
        String time2 = df2.format(ld);
        String time3 = df3 .format(ld);
        System.out.println(time3);

        //for more methods visit java documentation



    }
}
