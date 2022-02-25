package com.company;

import java.util.Scanner;

public class practice_set_Errors_exception {
    public static void main(String[] args) {

        //question 1
        //Syntax error
//        int a=3
//        int b = 8;
//        System.out.println(a/b);

        //logical error

        //for finding prime number which is --->>>> 2,3,5,7, not 9 so its one kind of logical error
//        System.out.println(2);
//        for (int i=1 ; i<5; i++) {
//           // System.out.println(2);
//            System.out.println(2 * i + 1);
//        }
//        System.out.println("these are the prime number from 1 to 10");

        //RunTime error

//        int a=9;
//        int b= 0;
//        System.out.println( a/b);

        //question 2
//        int a =9;
//        int b =678;
//
//        try {
//            System.out.println(a/b);
//
//        }
//       catch (IllegalArgumentException e){
//           System.out.println("HEHE...HEHHE..😂😂😁😁");
//        }
//        catch (ArithmeticException e){
//            System.out.println("HAHAA...HAHAH,...HAHA😁😁😁");
//        }

        //question 3


        int [] marks = {12,1,34,56,78};
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int i=0;
        try {
            while (flag) {
                System.out.println("enter any array index");
                int index = sc.nextInt();
                System.out.println(marks[index]);
                if (index == marks[index] && i<5) {
                    System.out.println("Great u matched array" + marks[index]);
                    break;
                }


            }

        }catch (Exception e){
            System.out.println("Error");
            i++;
        }


    }
}


