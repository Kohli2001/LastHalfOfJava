package com.company;
import java.util.Scanner;


// practice set on oops
// question 1
class  Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public void setSalary(int s){
        salary = s;
    }
    public String getname(){
        return  name;
    }
    public void  setName(String n){
        name = n;

    }
}
class cellphone0{
    String ring , vibrate;

    public void  setRing(String r){
        ring = r;
    }
    public String getRing(){
        return ring;
    }
    public void setVibrate( String v){
        vibrate = v;
    }
    public String getVibrate(){
         return vibrate;
    }

}
class cellphone{
    String ring,vibrate;

    public void ringing(){
        System.out.println("ringing....");
    }
    public void vibrating(){
        System.out.println("vibrating....");
    }
    public void playingGame(){
        System.out.println("playing.....");
    }
    public void calling(){
        System.out.println("calling......");
    }

}
class Square{
    int side;

    public int getArea(){
        return side*side;
    }
//    public void setArea(int a){
//        side=a;
////    }
//    public void setParamiters(int a){
//        side = a;
//    }
    public int getParamiters(){
        return 4*side;
    }
}
class Reactangle{
    int length;
    int width;
    public int calculateArea(){
        return length*width;
    }
    public int calculateParimeter(){
        return 2*(length+width);
    }
}
class TommyVecetti{
    String hit,run,fire,move;

    public void hit(){
        System.out.println("Hitting...");
    }
    public void run(){
        System.out.println("Running....");
    }
    public void fire(){
        System.out.println("firing....");
    }
    public void move(){
        System.out.println("move...move");
    }
}
class Circle{
    double radius;

    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
}


//class Emlpoyee{
//    int id;
//    String name;
//    int salary =89;
//    public void getdetails(){
//        System.out.println("my is is :" +id);
//        System.out.println("my name is : " +name);
//
//    }
//
//    public int getId(){
//        return id;
//    }
//    public int getsalary(){
//        return salary;
//    }
//
//}
//
public class creating_class_methods {
    public static void main(String[] args) {
        //question 6
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of radius");
        Circle cle = new Circle();
        cle.radius = sc.nextDouble();
        System.out.println("Area of circle for given radius  = " +cle.calculateArea());
        System.out.println("Perimeter for circle for given radius = " +cle.calculatePerimeter());



//        //question 5
//        TommyVecetti rockstar = new TommyVecetti();
//        rockstar.fire();
//        rockstar.run();
//        rockstar.move();
//        rockstar.hit();

//        //question 4
//        Reactangle rct = new Reactangle();
//        rct.length = 4;
//        rct.width = 6;
//        System.out.println( rct.calculateArea());
//        System.out.println(rct.calculateParimeter());


        //question 3
//
//        Square sq = new Square();
//        sq.side=3;
//        System.out.println(sq.getArea());
//        System.out.println(sq.getParamiters());

//        s.setArea(4);
//        System.out.println("the area of the given side is =" +s.getArea());
//        s.setParamiters(3);
//        System.out.println("the parameter of given side is = " +s.getParamiters());

        // question 2
        cellphone vivo = new cellphone();
        vivo.ringing();
        vivo.vibrating();
        vivo.calling();
        vivo.playingGame();

//        cellphone0  oppo = new cellphone0();
//       oppo.setRing("ringing....");
//        System.out.println(oppo.getRing());
//        oppo.setVibrate("vibrating....");
//        System.out.println(oppo.getVibrate());

        //question 1
//        Employee vinay = new Employee();
//        vinay.setName("kamlesh");
//        System.out.println(vinay.getname());
//        vinay.setSalary(5600);
//        System.out.println(vinay);
      //  System.out.println(vinay.getSalary());

//        Scanner sc = new Scanner(System.in);
//        Emlpoyee kamlu = new Emlpoyee();
////        System.out.println("enter your salary");
////        int salary = sc.nextInt();
//     //  System.out.println("enter your id  ");
//       // kamlu.id=sc.nextInt();
//
//      //  System.out.println("enter your name");
//        //kamlu.name= sc.nextLine();
//       // System.out.println("my name is :" +kamlu.name);
//       // kamlu.getdetails();
//        //kamlu.getdetails();
//        //System.out.println();
//        int salary = kamlu.getsalary();
//        System.out.println(salary);
//
//
//        int id = kamlu.getId();
//        System.out.println(id);
//
//
    }
}
