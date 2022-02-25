package com.company;
import java.util.Scanner;


class primeThread extends Thread{

    primeThread(String n ){
        super(n);
        System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        n = getName();

    }
    public void run(){
        System.out.println("i am thraed");
    }

}

class MyRunnable implements Runnable{
    MyRunnable(Runnable r ,String name){
        super();
    }
    public void run(){
        System.out.println("i am runnable thread");
    }
}

public class constructor_in_thread {
    public static void main(String[] args) {
       //yRunnable r = new MyRunnable


       // Scanner sc = new Scanner(System.in);
        primeThread p = new primeThread("name");
        System.out.println("my id is " +p.getId());
        System.out.println("my name for this thraed is " +p.getName());
        p.start();
//
//        primeThread p2 = new primeThread("vinay");
//        System.out.println("id = " +p2.getId());
//        System.out.println("name = " +p2.getName());
//        p2.start();
//




    }
}
