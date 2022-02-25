package com.company;

//question 2

class welcomeThread  extends  Thread {

    public void run() {
        while (true) {

            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("WELCOME");
        }

    }
}
class mornigThread extends Thread {
    public void run() {
        while (true) {
            try{
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("GOOD MORNING");
        }

    }
}




//question 1
class Mythreads extends Thread {

//    Mythreads() {
//
//    }

    public void run() {
        while (true) {
            System.out.println(" GOOD MORNING");
            System.out.println(" Welcome");
        }

    }
}

public class practice_set_Threads {
    public static void main(String[] args) {
        //question1
//
//        Mythreads t = new Mythreads();
//        t.start();

        //question 2

        mornigThread mt = new mornigThread();
        mt.setPriority(5);
        System.out.println(mt.getPriority());
      //  mt.start();
        welcomeThread wt = new welcomeThread();
        wt.setPriority(8);
        System.out.println(Thread.currentThread().getPriority());
        wt.start();

    }
}
