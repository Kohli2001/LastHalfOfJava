package com.company;

//secodn method to use thread class

class RunnableThread1 implements  Runnable{

    public void run(){
        for (int i=0; i<100; i++){
            System.out.println("i am from runnablethread 1 ");

        }

    }
}
class RunnableThread2 implements Runnable{
    public void run(){
        for (int i=0; i<100; i++){
            System.out.println("i am from runnablethread 2");
        }
    }
}



public class runnable_in_thread {
    public static void main(String[] args) {
        RunnableThread1 run1 = new RunnableThread1();
        Thread t1 = new Thread(run1);
        RunnableThread2 run2 = new RunnableThread2();
        Thread t2 = new Thread(run2);

        t1.start();
        t2.start();

    }
}
