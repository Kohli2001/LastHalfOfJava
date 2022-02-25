package com.company;

//question 1&2

abstract class Pen{
     abstract  void write();
     abstract void refill();

   }
   class fountainPen extends Pen{
    void write(){
        System.out.println("writing from pen...");
    }
    void refill(){
        System.out.println("change the refill once it ends");
    }
    void changeNib(){
        System.out.println("changing the nib");
    }

}
interface  basicAnimals{
    void eat();
    void sleep();
}
class monkey{
  public  void jump(){
      System.out.println("jump...");

  }
  public void bite(){
      System.out.println("biting...");

  }
}
class human extends monkey implements basicAnimals{
    public void eat(){
        System.out.println("eating...");

    }
    public void sleep(){
        System.out.println("sleeping...");

    }
}
//question4

class Teleohone{
   public void ring(){

       System.out.println("ringing...");
    }
    void lift(){
        System.out.println("lifting...");

    }
    void disconnect(){
        System.out.println("disconnecting...");

    }
}
class smartPhone extends Teleohone{
    void takesnap(){
        System.out.println("taking snapshot");
    }

}
//question 6
interface TvRemote{
    void onButton();
    void volumeButton();

    //question 7
}
class Tv implements TvRemote{
    public void onButton(){
        System.out.println("cliking");
    }
    public void volumeButton(){
        System.out.println("volume ups and down");
    }
}

//interface smartTvRemote extends TvRemote{
//    void connectMobile();
//    void videoCast();
//}
//class  simplyfying implements smartTvRemote{
//    public void onButton(){
//        System.out.println("click on");
//    }
//    public void volumeButton(){
//        System.out.println("volume ups and down");
//    }
//    public void connectMobile(){
//        System.out.println("connecting to mobile...");
//    }
//    public void videoCast(){
//        System.out.println("casting the video from mobile");
//    }
//}


public class practice_set_on_abstract {
    public static void main(String[] args) {
        //question 1 and 2

//        fountainPen fpen = new fountainPen();
//        fpen.write();
//        fpen.refill();
//        fpen.changeNib();

        //question3
//        human us = new human();
//        us.eat();
//        us.jump();

        //question 4
//       Teleohone obj = new smartPhone();
//      // obj.takesnap();---> error due to polymorphism
//       obj.disconnect();
//       obj.ring();

       //question 6

//      simplyfying all = new simplyfying();
//      all.connectMobile();
//      all.onButton();
//      all.volumeButton();

        //question 7

        Tv obj = new Tv();
        obj.onButton();;
        obj.volumeButton();


    }
}
