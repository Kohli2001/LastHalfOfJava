package com.company;

import java.util.ArrayList;
import java.util.Scanner;




public class code_dope_array {


    public static void main(String[] args) {
        //q no 1
        ArrayList integer = new ArrayList();
        integer.add(1);
        integer.add(2);
        integer.add(3);
        integer.add(4);
        integer.add(5);
        integer.add(6);
        integer.add(7);
        integer.add(8);
        integer.add(9);
        integer.add(10);
//        integer.add(56);
//        for (int i = 1; i < integer.size(); i++) {
//            System.out.print(" " + i);
//
//            if (56 == integer.size()) {
//                System.out.println("yes it is");
//            }
//        }

        // begginers schools

//            ArrayList l = new ArrayList();
//            l.add(34);
//        System.out.println(l);

        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the array ");
//       ArrayList l = new ArrayList();
//        l=sc.findAll();

//        for (int i=1 ; i<=100; i++){
//            if (i%2==0){
//                System.out.print(i + " ");
//            }
//
//        }
/*
        for (int i =1; i<=100; i++){
            if (i%2==1){
                System.out.print(i + " ");
            }
        }*/

        System.out.println("enter the number");
        int n = sc.nextInt();
        if (n+1%2==0){
            System.out.println("its a sunny number");
        }
        else {
            System.out.println("no! its not a sunny number");
        }


    }
}

