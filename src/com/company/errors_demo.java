package com.company;
import java.util.Scanner;

public class errors_demo {
    public static void main(String[] args) {

        //logical error
//
//        for (int i=1; i<5; i++){
//            System.out.println(2);
//            System.out.println(2*i+1);
//


       //runTime Error

        while(true) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println("1000 divisible by given number is  " + 1000 / x);

        }


    }
}
