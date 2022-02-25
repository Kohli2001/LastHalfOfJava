package com.company;
import javax.swing.*;
import javax.swing.plaf.basic.BasicTreeUI;
import java.util.Arrays;
import java.util.Scanner;

public class practice_set_array {
    public static void main(String[] args) {

//        //To add the array
//        float[] array ={56.3f,78.9f,90.5f,56.0f,67.0f};
//        float sum=0;
//        for (float element:array){
//            sum=sum+element;
//           // System.out.println(sum);
//        }
//        System.out.println("the sum of given array " +sum);

        //
        //check wheter number is present in array

//        System.out.println("enter your number");
//        Scanner sc = new Scanner(System.in);
//        int num =sc.nextInt();
//        int [] marks ={56,78,67,44,23,45,90};
//        boolean IsInArray = false;
//        for (int element:marks) {
//            if (num == element) {
//                IsInArray = true;
//                break;
//            }
//        }
//            if (IsInArray){
//                System.out.println("the given value is present in array " +num);
//            }
//            else {
//                System.out.println("no the given value is nit present in array");
//            }


//
//
////
//        int[] array = {11,22,33,44,55};
//        for (int element:array) {
////            System.out.println(element);
////        }
//            for (int i = 0; i <=array.length; i++){
//                System.out.println(array[i]);
//            }
//        }

//        int [] array = {1,2,3,4,5,6,7};
//        int num=9;
//        boolean IsInArray=false;
//        for (int element:array) {
//            if (num == element) {
//                IsInArray = true;
//                break;
//            }
//        }
//
//                if (IsInArray) {
//                    System.out.println("yes is it");
//
//
//                } else {
//                    System.out.println("no! worng");
//                }

//        System.out.println("enter your physics marks list");
//        Scanner sc = new Scanner(System.in);
//
//        int [] PhysicsMarks ={98,87,75,65,55};
//        int sum=0;
//        for (int element:PhysicsMarks){
//            sum= sum+element;
//
//        }
//        System.out.println("the average of physics marks is = " +sum/PhysicsMarks.length);
////
        //to add the two matrixes
//        int [][] mat1 = {{1,2,3},
//                         {4,5,6}};
//        int[][] mat2 = {{7,8,9},
//                       {10,11,12}};
//        int[][] result={{0,0,0},
//                        {0,0,0}};
//        for (int i=0; i<mat1.length; i++) {
//            for (int j = 0; j < mat1[i].length; j++) {
//                System.out.format("setting the values for i=%d j=%d\n", i, j);
//                //  System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//            for (int i=0; i<mat1.length; i++) {
//                for (int j = 0; j < mat1[i].length; j++) {
//                    //  System.out.format("setting the values for i=%d j=%d  \n" , i,j );
//                    System.out.print(result[i][j] +  "  ");
//                    result[i][j] = mat1[i][j] + mat2[i][j];
//
//                }
//                System.out.println(" ");
//            }

        //
//        //reverse of array
//
//        int[] array ={1,2,3,4,5,6};
//        int l = array.length;
//        int n = Math.floorDiv(l , 2);
//        int temp;
//        for (int i=0; i<n; i++){
//            temp = array[i];
//            array[i] = array[l-i-1];
//            array[l-i-1] = temp;
//
//        }
//        for (int element:array){
//            System.out.print(element + " ");
//        }
///
        // to find the maxium array
        //my method
//        int [] array = {23,40,50,89,95};
//        System.out.println(Arrays.stream(array).max());
        //his method
//        int[] array = {90,7,78,95,32,1,};
//        int max=0;
//        for (int e:array) {
//            if (e > max) {
//                max = e;
//            }
//        }
//        System.out.println(max);

//        // to find minimum element in array
//        int [] array = {34,90,87,4,9};
//
//        int min = Integer.MIN_VALUE;
//
//        for (int e:array){
//            if (e> min){
//                min=e;
//            }
//        }
//        System.out.println(min);

        //to find wheather array is sorted or not
//        boolean IsSorted= true;
//        int [] array ={1,57,38,78,9,9};
//        for (int i=0; i<array.length; i++){
//            if (array[i]>= array[i+1]){
//                IsSorted=false;
//                break;
//            }
//        }
//        if (IsSorted){
//            System.out.println("yes this array is sorted");
//        }
//        else {
//            System.out.println("no! this array is not sorted ");
 //       }

//        System.out.println("enter the size of array");
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int x = sc.nextInt();
//        int[] number = new int[size];
//      //  for (int element:number)
//        for (int i=0; i<size; i++){
//            System.out.println( i + " ");
//
//        }
//        for (int i=0; i<number.length; i++){
//           if (number[i]==x){
//
//           }
//            System.out.println(" X found in " +i);
//        }
//       // if ()
//
//        System.out.println("enter your rows");
//        Scanner sc = new Scanner(System.in);
//        int row=sc.nextInt();
//        System.out.println("enter your column");
//        int col=sc.nextInt();
//        int number[][] = new int[row][col];
//
//        for (int i=0; i<row; i++){
//            for (int j=0; j<col; j++){
//                number[i][j]= sc.nextInt();
//
//            }
//        }
//        System.out.println("enter your X value");
//        int x = sc.nextInt();
//        for (int i=0; i<row; i++){
//            for (int j =0; j<col; j++){
//                if (number[i][j]==x){
//                    System.out.println("x found at location("+ i +", "+j +")");
//                }
//            }
//
//        }
//
//        System.out.println("enter your rows");
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        System.out.println("enter your column ");
//        int col = sc.nextInt();
//
//        System.out.println("enetr your array elements");
//        int number[][] = new int[row][col];
//        for (int i=0; i<row; i++){
//            for (int j=0; j<col; j++){
//                number[i][j]= sc.nextInt();
//            }
//        }
//        for (int e :number[row][col])












        }

    }
