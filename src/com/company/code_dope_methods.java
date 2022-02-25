package com.company;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Scanner;

class question {
    Scanner sc = new Scanner(System.in);


    public int max() {
        System.out.println("enter the number");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int max = Math.max(n1, n2);
        return max;
    }

    public int min() {
        System.out.println("enter the number");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        // int n3 = sc.nextInt();
        int min = Math.min(n1, n2);
        return min;

    }

    public int even() {
        System.out.println("enter any number");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("yes is it even ");
        }
        return num;
    }

    public int odd() {
        System.out.println("enter any number");
        int num = sc.nextInt();
        if (num % 2 != 1) {
            return num;
        }

        return num;
    }
}
class  Qno_4{
    Scanner sc = new Scanner(System.in);
    public int sum(){
        System.out.println("enter two number");
        int n1 = sc.nextInt();
        int n2= sc.nextInt();
        int sum = n1+n2;
        return sum;
 }
 public  int mul(){
     System.out.println("enter two number");
     int n1=sc.nextInt();
     int n2 = sc.nextInt();
     int product = n1*n2 ;
     return product;
    }




}
class codecircle{
    int radius;
    Scanner sc = new Scanner(System.in);
    public double circumference(){
        System.out.println("Enter the radius");
        this.radius = sc.nextInt();
        double circum = 2*Math.PI*radius;
        return circum;

    }
    public double area(){
        System.out.println("Enter the radius");
        this.radius = sc.nextInt();
        double radius = Math.PI*this.radius*this.radius;
        return radius;

    }
}
class marksheet {
    Scanner sc = new Scanner(System.in);


    public void grade() {
        System.out.println(" enter your marks out of 100");
        int n = sc.nextInt();
        if (n >= 91 && n <= 100) {
            System.out.println("Your grade is : AA");
        } else if (n >= 81 && n <= 90) {
            System.out.println("Your grade is : AB");
        } else if (n >= 71 && n <= 80) {
            System.out.println("Your grade is : BB");
        } else if (n >= 61 && n <= 70) {
            System.out.println("Your grade is : BC");
        } else if (n >= 51 && n <= 60) {
            System.out.println("Your grade is : CD");
        } else if (n >= 41 && n <= 50) {
            System.out.println("Your grade is : DD");
        } else {
            System.out.println("Oh!...u fail ");
        }

    }

    public int fact() {
        System.out.println("enter any number for factorial");
        int n = sc.nextInt();
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fact() * (n - 1) * n;

        }
    }
}


public class code_dope_methods {
    public int factorial(int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to factorial");
         n = sc.nextInt();
        if (n==0 || n==1){
            return 1;
        }
        else {
            return factorial(n-1)*n;
        }
    }
    public static void main(String[] args) {
        //q no1
//        question q = new question();
//        System.out.println( q.max());
//        System.out.println(q.min());

        //q no 2
////
//        question q = new question();
////        q.even();
//        System.out.println( q.odd());

        //q no 3
//
       Scanner sc = new Scanner(System.in);
//        System.out.println("enter  your age ");
//        int age = sc.nextInt();
//        if (age>=18){
//            System.out.println("yes your are eligable");
//        }
//        else {
//            System.out.println("sorry its too sort to vote");
//            System.out.println(age);
//        }
//        //q no 4 & 5
//       Qno_4 q = new Qno_4();
////        System.out.println(q.sum());
//        System.out.println(q.mul());

        //q no 6
//        codecircle cr = new codecircle();
//        System.out.println(cr.area());
//        System.out.println(cr.circumference());
        //q no 7

//        System.out.println("enter any number");
//        int num = sc.nextInt();
//        if (num%1==0){
//            System.out.println("it is a prime");
//        }
//        else if(num%num==0) {
//            System.out.println("no its  a prime");
//        }
//        else {
//            System.out.println("no its not");
//        }
       // q no 8

//        marksheet m = new marksheet();
//        m.grade();

        //q no 9
//        code_dope_methods cdm = new code_dope_methods();
//        System.out.println(cdm.factorial(4));

//        // q no 1 ---->>> LEVEL 2
//        int n =15;
//        for (int i=1; i<=10; i++){
//            System.out.format("%d X %d = %d \n" ,n,i,n*i);
//        }

        //q no 2

















    }
}
