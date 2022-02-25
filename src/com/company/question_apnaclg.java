package com.company;

import java.util.Scanner;

public class question_apnaclg {
    //question 1
    public static int calculateAvg(int a, int b, int c) {
        int sum = 0;
        sum = a + b + c / 3;

        return sum;
    }
    //question 2

    static int calculateSumOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }


    //question 3
    public static int findGreater(int a, int b) {
       if (a>b){
           return a;
       }
       else if (b>a){

       }
       return b;
    }
    //question 4

    public static double printcircumference(double r){
        return 2*Math.PI*r;
    }
    //question 5

    public static int  eligbleForVote(int age){
        if (age>18){
            System.out.println("yes! you are eligble for vote ");
        }
        else {
            System.out.println("No! you are not eligble for vote");
        }
        return age;
    }
    // questin 8

    public static double calculatePrintPower(double x, double n){
        double power = Math.pow(x,n);
        return power;
    }
    //question 10
    public static int fib(int n){
        if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //question 1
        //      int n=sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println("the average of the given numbers is = " +calculateAvg(a,b,c));

        //question 2
//        int n=sc.nextInt();
//        //for (int i=1; i<=n; i++ ){
//        System.out.println(calculateSumOdd(n));
//        }
//        //Question 3
//        System.out.println("enter the first num");
//        int a = sc.nextInt();
//        System.out.println("enter the second num");
//        int b = sc.nextInt();
//        System.out.println("the greatest value among two is " + findGreater(a, b));
//

        //question 4
//        System.out.println("enter the radius of the circle");
//        double r = sc.nextInt();
//        System.out.println("the circumference of given radius " +printcircumference(r));

        //question 5
//        System.out.println("enter the age");
//        int age = sc.nextInt();
//        System.out.println(eligbleForVote(age));

        //question 6
//        int n = sc.nextInt();
//        int i=n;
//        do {
//            System.out.println(i);
//        }while (i>=0);
//           i++;
//        }
        //question 7
//        //enter the number till the user wants
//        int number;
//        int countPositive=0;
//        int countNegative=0;
//        int countZero=0;
//        char choice;
//        do {
//            System.out.println("enter the number");
//            number=sc.nextInt();
//            if (number>0){
//                countPositive++;
//            }
//            else if (number<0){
//                countNegative++;
//            }
//            else {
//                countZero++;
//            }
//            System.out.println("Do you want to continue Y/N");
//            choice = sc.next().charAt(0);
//        }while (choice== 'y');
//
//        System.out.println("positive numbers: " + countPositive);
//        System.out.println("positive numbers: " + countNegative);
//        System.out.println("positive numbers: " + countZero);


        //question 8
//        System.out.println("enter the value of x");
//        double x = sc.nextDouble();
//        System.out.println("enter the value of n");
//        double n = sc.nextDouble();
//        double power = Math.pow(x,n);
//        System.out.println("the power of x to n is :" +power);

        //question 8 by second method
//
//        System.out.println("enter the value of x");
//        double x = sc.nextDouble();
//        System.out.println("enter the value of n");
//        double n = sc.nextDouble();
//        System.out.println("the power of the given  number is : " +calculatePrintPower(x,n));

        //question 10
//        System.out.println("enter the number");
//        int x = sc.nextInt();
//        for (int i=0; i<x; i++){
//            System.out.print( +fab(i) + "  ");
//
//        }
//        System.out.println("are the  fabonicci series is:");

        // code for sum of n natural number
        int n = 3;
        int sum =0;
        if (n>0){
            for (int i=0; i<=n; i++){
                sum= sum+i;
            }
        }
        System.out.println(sum);









    }

}


