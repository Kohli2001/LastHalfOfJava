package com.company;

import java.text.AttributedCharacterIterator;
import java.util.Scanner;

public class exception_handling {
    public static void main(String[] args) {
        int [] marks = {12,24,56, 89};
        System.out.println("enter your index");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println("enter the number to divide");
        int number = sc.nextInt();
        try{
            System.out.println("your array index is " +marks[index]);
            System.out.println("and your array by division is " +marks[index]/number);

        }
        catch (ArrayIndexOutOfBoundsException e){

            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (Exception e ){
            System.out.println(e);
        }
    }

    }

