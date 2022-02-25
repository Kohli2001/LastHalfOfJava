package com.company;

//method1 to use the Thread class;

class Mythread1 extends Thread{
   public void run(){
        while (true){
            System.out.println("i am cooking from Mythread class");
            System.out.println("i am sad yaar");
        }
    }

}
class Mythread2 extends Thread{

     public void run(){
        while(true){
            System.out.println("i am chatting with her");
            System.out.println("i am very happy");
        }
    }
}


public class threading_concepts {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();    //----> it both start  method works simunteniously in thread class

    }
}
