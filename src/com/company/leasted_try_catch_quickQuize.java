package com.company;
import javax.swing.*;
import java.util.Scanner;


class MyException extends Exception{

    @Override
    public String toString() {
        return "i am to string";
    }

    @Override
    public String getMessage() {
        return "i am getMessage";
    }
}




public class leasted_try_catch_quickQuize {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

            System.out.println("enter your age");

            int age = sc.nextInt();
            if (age > 120) {
                try {
                    throw new Exception("Invalid data ");


                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println(e.toString());
                    System.out.println(e);

                }


            } else {
                System.out.println("your age is good and well be haelthy");

                System.out.println("thank you");
            }





//
//        System.out.println("enter the value of index");
//        int []  marks = {12, 45, 36, 3};
//        Scanner sc = new Scanner(System.in);
//        boolean flag = true;
//        while (flag) {
//
//            int index = sc.nextInt();
//            try {
//                System.out.println("the index you choose is " + marks[index]);
//                flag = false;
//
//        }
//            catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("Sorry the given index is does not exist");
//            }
//            catch (Exception e){
//         /
//        int mynum = 16;
//        System.out.println("enter your number to match with mine");
//        Scanner sc = new Scanner(System.in);
//        boolean flag = true;
//        while(flag){
//            int yournum = sc.nextInt();
//           if (yournum==mynum){
//               System.out.println("Yes! you Matched");
//               flag = false;
//           }
//           else if (yournum >50){
//               System.out.println("its too High");
//           }
//           else if (yournum<16){
//               System.out.println("its too Low");
//
//           }
//           else {
//               System.out.println("Oh ! Try Again");
//           }
//
//        }
    }
}