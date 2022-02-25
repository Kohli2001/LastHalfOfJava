package com.company;

import java.util.Scanner;

public class practice_on_methods {
    // question 1
    //all question by CWH
    public static void printMulTable(int n){
        for (int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d \n" , n,i,n*i);
        }
    }
    //question 2
    public static void printStar(int n){
        for (int i=0; i<=n;i++ ){
            for (int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
   // question 3
    static void sumOfNatural(int n){
        int sum=0;
        if (n>0){
            for (int i=1; i<=n; i++){
                sum= sum+i;
            }
            System.out.println(sum);
        }

    }

    // question 3 by recursion
    static int sumRec(int n){
        if (n==1){
            return 1;
        }
        return n+sumRec(n-1);
    }
    //question 4
    static void printHalfPyrimdStar(int n){
        for (int i=n; i>=0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //question 5
    static int fibRec(int n){
        if (n==1){
            return 0;
        }                 //we can also write like if(n==1 || n==2) then return (n-1)
        else if (n==2){
            return 1;
        }
        else {
            return fibRec(n-1)+fibRec(n-2);
        }

    }
    //question 9 (c to f)
    static void celciusToferahite(double celcius){
       celcius= (celcius*9/5)+32;
        System.out.println(celcius + "f");
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the Table Number");
//        int n = sc.nextInt();
 //       printMulTable(7);
  //      printStar(6);
   //     sumOfNatural(3);
    //    System.out.println(sumRec(4));
     //   printHalfPyrimdStar(4);
     //   System.out.println(fibRec(7));  // fibonacci series = 0 1 1 2 3 5 8 13 21 34.....
        celciusToferahite(35);
    }
}
