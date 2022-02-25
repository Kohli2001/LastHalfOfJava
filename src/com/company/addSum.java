package com.company;

import java.util.Scanner;

public class addSum {
//    public static int calculateMul(int a , int b){
//        int mul = a*b;
//        return mul;
//    }
//    public static int calculateSum(int a , int b){
//        int sum = a+b;
//        return sum;
//    public static void calculateFact(int n){
//        if (n>0){
//            System.out.println("invalid numbers");
//            return;
//        }
//        int factorial =1;
//        for (int i=n; i>=1; i--){
//           factorial = factorial*i;
//        }
//        System.out.println(factorial);
//      //  return factorial;

//    public static void checkPrime(int n){

//            if (n%n==0 && n%1==0){
//                System.out.println("it is a prime number " +n);
//
//            }else {
//                System.out.println("it is not a prime number");
//
//        }
//    public static void checkEvenOdd(int n){
//        if (n%2==0){
//            System.out.println("given number is even");
//        }
//        else{
//            System.out.println("given number is odd");
//
//        }
    public static void tableNumber(int n){
        for (int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d \n" ,n,i,n*i);
        }


}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n = sc.nextInt();
        tableNumber(n);
      //  checkEvenOdd(n)
        //checkPrime(n);
       // calculateFact(n);
       // System.out.println(calculateFact(n));
      //  System.out.println("the factorial of given number is " +);
//        System.out.println("enter the first number");
//        int a =sc.nextInt();
//        System.out.println("enetr the second numbers");
//        int b = sc.nextInt();
//
//        int mul =calculateMul(a,b);
//        System.out.println("the product of  numnbers " +a + " and " + b + " is = " +mul);
//        int sum =  calculateSum(a,b);
//        System.out.println("the sum of the 2 numbers is = " +sum);





    }
}
