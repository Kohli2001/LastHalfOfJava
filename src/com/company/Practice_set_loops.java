package com.company;
import java.util.Scanner;
public class Practice_set_loops {
    public static void main(String[] args) {

        //To print * pattern
//        System.out.println("Enter your number");
//        Scanner sc =  new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i=n; i>0; i--){
//            for (int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//
//        }

        //to find sum of n even numbers

//        int sum=0;
//        int n=3;
//        for (int i=0; i<=n; i++){
//            System.out.println(2*i);
//
//            sum= sum+(2*i);
//        }
//        System.out.print("the sum of first n numbers is " +sum);

//        System.out.println("Enter any value of n ");
//        Scanner sc = new Scanner(System.in);
//        int sum =0;
//        int n = sc.nextInt();
//        for (int i=0; i<=n; i++){
//            System.out.println(2*i);
//            sum=sum+(2*i);
//
//        }
//        System.out.println("the sum of your n values is = " +sum);


        //To print a multiplication table of a given number n
//        System.out.println("Enter the multiplicatin table number ");
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       for (int i=1; i<=10; i++ ){
//           System.out.printf("%d X %d = %d  \n" , n,i,n*i);
//       }

//        int n =10;
//        for (int i=n; i>=1; i--){
//            System.out.printf("%d X %d = %d \n" ,n,i,n*i);
//        }

        //to find factorials
        ////pending concepts


        // to calculate the sum o fthe numbers accuring in thr table of 8

//        int n=1;
//        int sum=0;
//        for (int i=1; i<=10; i++){
//            System.out.printf("%d X %d = %d \n " ,n,i,n*i);
//            sum=sum+(n*i);
//        }
//        System.out.println("the sum of the given table is = " +sum) ;

//        int n = 4;
//        for (int i=1; i<=n; i++){
//            for (int j =0; j<i; j--){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//
//        System.out.println("enetr your number ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i =1; i<=n; i++){
//            for (int j =1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();

        //     }

//        for (int i=1; i<=4; i++){
//            for (int j =4; j>=i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i=1; i<=4; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int k=3; k>=1; k--){
//            for (int m=1; m<=k; m++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int  i=1; i<=4; i++){
//            for (int j=3; j>=i; j--){
//                System.out.print(" ");
//            }
//            for (int k=1; k<=4; k++){
//                for (int m=1; m<=k; m++){
//                    System.out.print("*");
//
//                }
//
//            }
//            System.out.println();
        //       }
        //Hlaf pyramid

//        for (int i = 1; i<=4; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Solid reactangle
//        for (int i = 1; i<=4; i++){
//            for (int j = 1; j<=5; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //Holllow reactangle
        //int n=4;
        //int m=5;
//        for (int i =1; i<=n; i++){
//            for (int j=1; j<=m; j++){
//                if (i==1 || j==1 || n==i|| m==j){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        // Inverted Half Pyramid (180)
//
//        //for row (outer loop)
//        for (int i =1; i<=n; i++){
//            //outer loop - for spaces
//            for (int j=1; j<=n-i; j++){
//                System.out.print(" ");
//
//                }
//            //for outerloop - star print
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//
//
//            }
//            System.out.println();
//
//        }
        // Half Pyramid with numbers
        //row=n
        //col=m
        //     int n = 5;
        //     int m = 5;
//        for (int i =1; i<=n; i++){
//            for (int j =1; j<=i; j++){
//                System.out.print(j+ " ");
//            }
//            System.out.println();
//        }
        // Inverted Half Pyramid with numbers
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=n-i+1; j++){
//                System.out.print(j+ " ");
//            }
//            System.out.println();
//        }

        //Floyd's Triangle
        // 1
        //2 3
        //4 5 6
        //7 8 9 10
        //11 12 13 14 15
//        int num=1;
//        for (int i=1; i<=n; i++){
//            for (int j =1; j<=i; j++){
//                System.out.print(num+ " ");
//                num++;
//            }
//            System.out.println();
//        }
//
//        //0-1 tringle
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                int sum=i+j;
//                if (sum %2==0){
//                    System.out.print("1 ");
//                }
//                else {
//                    System.out.print("0 ");
//                }
//
//            }
//            System.out.println();
//        }
        String choice = "";
        int product = 1;
        int sum = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number or q to quit");
        while (!choice.equals("q")) {
            choice = sc.next();
            if (!choice.equals("q")) {
                int number = Integer.parseInt(choice);
                sum = sum + number;
                product = product * number;
                count++;

            }
        }

            System.out.println("product is : " + product);
            System.out.println("average is ; " + sum/count);

    }
}
