package com.company;

//question1

class circle1{
    public int radius;

    circle1(){
        System.out.println("i am non para circle");

    }
    circle1(int r){
        this.radius = r;
        System.out.println("i am paramized circle");
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylander extends circle1{
    public int height;
    Cylander(int r , int h){
        super(r);
        this.height = h;
       System.out.println("i am a cyclinder class ");
    }
    public double area (int height){
        return Math.PI*radius*radius*height;
    }

}

// question2

class Reactangle1{
    public int lenght;
    public int width;

    Reactangle1(){
        System.out.println("i am default constructor from ractangle");
    }
    Reactangle1(int l ) {

        this.lenght = l;

    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    Reactangle1(int l,  int w){
        this.width=w;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int Area(){
        return this.lenght*this.width;

    }
}

class Cuboid extends Reactangle1{
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int height;
    Cuboid(int h){
        super(1,2);
        this.height=h;
    }
    public int volume(){
        return this.height*this.lenght*this.width;

    }

}

public class practice_set_inheritace {
    public static void main(String[] args) {
       // circle objc = new circle(4);
//        Cylander obj = new Cylander(23,4);
//        obj.area(2);
      //  System.out.println(obj);

        //question 2
//        Reactangle1 rct1 = new Reactangle1(4,6);
//        rct1.Area();
        Cuboid objc = new Cuboid(2);
        System.out.println(objc.volume());
        System.out.println(objc.Area());





    }
}
