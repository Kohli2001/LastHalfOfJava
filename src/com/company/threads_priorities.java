package com.company;

class priorityThread extends Thread {

    priorityThread(String name) {
        super(name);
    }

    public void run() {
        while (true) {
            System.out.println("my name is " +this.getName());
        }
    }
}

public class threads_priorities {
    public static void main(String[] args) {
        priorityThread pt = new priorityThread("papa");
        priorityThread pt2 = new priorityThread("mummy");
        priorityThread pt3 = new priorityThread("bhaiya");
        priorityThread pt4 = new priorityThread("bari didi");
        priorityThread pt5 = new priorityThread("ranjan");
        priorityThread pt6 = new priorityThread("chotoDi");
        priorityThread pt7 = new priorityThread("me");
        pt.setPriority(Thread.MAX_PRIORITY);
        pt2.setPriority(Thread.MAX_PRIORITY);
        pt3.setPriority(Thread.NORM_PRIORITY);
        pt4.setPriority(Thread.NORM_PRIORITY);
        pt5.setPriority(Thread.MIN_PRIORITY);
        pt6.setPriority(Thread.NORM_PRIORITY);
        pt7.setPriority(Thread.MIN_PRIORITY);
        pt.start();
        pt2.start();
        pt3.start();
        pt4.start();
        pt5.start();
        pt6.start();
        pt7.start();

    }

}
