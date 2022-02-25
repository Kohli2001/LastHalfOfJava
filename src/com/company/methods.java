package com.company;

import javax.swing.*;
import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class methods {
    //    static void logic(int x, int y){
//        int  z;
//        z=x+y;
//
//    }
//    static void foo(){
//        System.out.println("hey bro");
//    }
//    static void foo(int a){
//        System.out.println("hey " +a+ "bro");
//    }
//    static void foo(String name){
//        System.out.println("kamlesh");
//
//    static int sum( int... arr) {
//        int result = 0;
//        for (int element : arr) {
//            result = +element;
//
//        }
//        return result;
    //recursion concepts

//    static  int factorial(int n){
//        if (n==0 || n==1){
//            return 1;
//
//        }
//        else {
//            return n*=factorial(n-1);
//
//        }
//
                 // fabonicci series
   public static int fabonicci(int n){
       if (n<=1){
           return n;
       }
       else {
           return fabonicci(n-1)+fabonicci(n-2);
       }

}
    static void tellJockes(){
        System.out.println("i invent the english language");
    }

    public static void main(String[] args) {
//        int a =2;
//        int b =4;
//        int c = a+b;
//        logic(a,b);
//        System.out.println(c);
//        methods m = new methods();
//        tellJockes();
        // method overloading
//        foo();
//        foo("");
//        foo(300);


//        //varags concepts
//        System.out.println("the sum of the 4 and 5 is: " +sum(4,5) );
//        System.out.println("the sum of the 2 and  4 and 5 is: " +sum(2,4,5) );
//        System.out.println("the sum of the 3,5, 4 and 5 is: " +sum(3,5,4,5) );

        //recursion concepts

        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i=0; i<x; i++){
            System.out.print(fabonicci(i) + " ");

        }
        System.out.println("are the fabonacci series  of given number : ");

//        int x = sc.nextInt();
//        System.out.println("the factorial of given number is : " +factorial(x));

    }
}
