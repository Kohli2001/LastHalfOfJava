package com.company;

import java.util.Scanner;

public class marks_percentage_calculator {
    public static void main(String[] args) {
//        String choice ="";
//        double percentage =9.5;
//       // int sum =0;
//        int sum=0;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your persentage or type q to quit");
//        while (!choice.equals("q")){
//            choice = sc.next();
//            if (!choice.equals("q")){
//                int number = Integer.parseInt(choice);
//                percentage=percentage*number;
//            }
//            System.out.println("your over all percentage is = "+percentage+ "%");
//        }

        // Marks to percentage Calculator

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your physics marks");
        int phyMarks = sc.nextInt();
        System.out.println("enter your chemistry marks");
        int chemMarks= sc.nextInt();
        System.out.println("enter your Mathematics marks");
        int mathMarks= sc.nextInt();
        System.out.println("enter your english marks");
        int engMarks = sc.nextInt();
        System.out.println("enter your hindi marks");
        int hindiMarks = sc.nextInt();
        System.out.println("enter your Out of Marks");
        int outOfMarks = sc.nextInt();
        int total = phyMarks+chemMarks+mathMarks+engMarks+hindiMarks;
        System.out.println("your total marks = " +total);
        int totalMarks = (phyMarks+chemMarks+mathMarks+engMarks+hindiMarks)*100;
        int pecentage = totalMarks/outOfMarks;
        System.out.println("your total overall percentage = " +pecentage+"%");



        String st = sc.nextLine();
    }
}
