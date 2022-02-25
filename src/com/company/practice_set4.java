package com.company;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class practice_set4 {
    public static void main(String[] args) {
//        int a = 10;
//        if (a==11){
//            System.out.println("i am 11");
//
//        }
//        else {
//            System.out.println("i am not 11");
//        }

        // question 2
//
//        System.out.println("enter your math marks");
//        Scanner scm = new Scanner(System.in);
//        float MathMarks = scm.nextFloat();
//        float mathpercentage = MathMarks/100;
//
//        System.out.println("enter your phy marks");
//        Scanner scp = new Scanner(System.in);
//        float PhyMarks = scp.nextFloat();
//        float phypercentage = PhyMarks/100;
//
//        System.out.println("enter your  chem marks ");
//        Scanner scc = new Scanner(System.in);
//        float CheMarks =  scc.nextFloat();
//        float chepercentage = CheMarks/100;
//        float percentage = MathMarks+PhyMarks+CheMarks/300;
//
//        if (mathpercentage>=33){
//            System.out.println("you are pass in math");
//
//        }
//        else if (phypercentage>=33){
//            System.out.println("you are pass in physics");
//        }
//        else if (chepercentage>=33){
//            System.out.println("you are pass in chemistry");
//        }
//        if (percentage>=40){
//            System.out.println("Congratulation ! you are pass ");
//        }
//        else {
//            System.out.println("Sorry! you are fail ");
//        }

        //try again

        // question 2

//        float m1,m2,m3,m4,m5;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your marks in mathematics");
//         m1 = sc.nextFloat();
//        System.out.println("enter your marks in chemistry");
//        m2 = sc.nextFloat();
//        System.out.println("enter your marks in physics");
//        m3= sc.nextFloat();
//        System.out.println("enter your marks in English");
//        m4=sc.nextFloat();
//        System.out.println("enter your marks in Hindi");
//        m5 = sc.nextFloat();
//
//        float age = (m1+m2+m3+m4+m5)/5.0f;
//        System.out.println("your overall percentage  is "  + age);
//        if (age>=40 && m1>=30 && m2>=30 && m3>=30 && m4>=30 && m5>=30){
//            System.out.println("Congratulation ! you are pass ");
//        }
//        else {
//            System.out.println("sorry! you are not promoted this year");
//        }

        //question 4
//        System.out.println("choose any number(1-7) for know the today's Day");
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        switch (day){
//            case 1 ->System.out.println("Monday");
//            case 2->System.out.println("Tuesday");
//            case 3 ->System.out.println("Wednesday");
//            case 4 ->System.out.println("Thursday");
//            case 5 ->System.out.println("Friday");
//            case 6 ->System.out.println("Saturday");
//            case 7 ->System.out.println("Sunday");
//            default -> System.out.println("Kindaly choose any  valid number between (1-7)");
//        }


        //question 5(LEAP YEAR)

//        System.out.println("enter any year");
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt() ;
//        if (year%400==0||  year%4==0 && year%100!=0){
//            System.out.println("yes! this is a leapYear");
//
//        }
//        else {
//            System.out.println("no! this is not a leapYear");
//
//
//
//
//        }


        System.out.println("enter any website");
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();
        if (website.endsWith(".com")){
            System.out.println("this is a commercial website");
        }
        else if (website.endsWith(".in")){
            System.out.println("this is an indian website");
        }
        else if (website.endsWith(".org")){
            System.out.println("this is an orgranized website");
        }
        else {
            System.out.println("this is not any kind of website ");
        }








        }

    }


