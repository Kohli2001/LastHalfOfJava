package com.company;

import java.util.Scanner;

class Phone{
    public void call(){
        System.out.println("calling from  phone");
    }
    public void on(){
        System.out.println("truning on phone");
    }
}
class SmartPhone extends Phone{
    public void playmusic(){
        System.out.println("playing music.....");
    }
    public void on(){
        System.out.println("truing on smartPhone");
    }
    public void call(){
        System.out.println("calling from Smartphone");
    }
}
class Car{
    public void car(){
        System.out.println(" a old car");
    }
}
class newcar extends Car{
    public void Bmw(){
        System.out.println(" i am new fashion car");
    }
    public void car(){
        System.out.println(" i am a new car");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {


//        Phone obj = new SmartPhone();
//        obj.call();
//
//        Car obj = new newcar();
//        obj.car();
    }
}
