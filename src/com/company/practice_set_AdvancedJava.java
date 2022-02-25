package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

public class practice_set_AdvancedJava {
    public static void main(String[] args) {
        //qno 1

//        ArrayList<String> students = new ArrayList<>();
//        students.add("VINAY");
//        students.add("KAMLESH");
//        students.add("RAJESH");
//        students.add("AJAY");
//        students.add("SUKHIT");
//        students.add("KRISHNA");
//        students.add("HIMANSHU");
//        students.add("PINTU");
//        students.add("VIKASH");
//        students.add("SAGAR");
//        for (Object name : students) {
//            System.out.print(name + ",");
//        }
        //Qno 2

//        LocalDateTime lt = LocalDateTime.now();
//
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd:mm:yyy");
//        String date = df.format(lt);
//        System.out.println(date);

        //qNo 3

//        Calendar  c = Calendar.getInstance();
//        System.out.println(c.get(Calendar.DATE) + ":" +c.get(Calendar.MONTH) + ":" + c.get(Calendar.YEAR));
//        //System.out.println();

        //qNo 5

        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(5);
        set.add(6);
        set.add(21);
        set.add(6);
        System.out.println(set);

    }
}
