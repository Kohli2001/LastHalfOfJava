package com.company;

class Base{
    //creating  a constructions
    Base(){
        System.out.println("i am a base class construction");

    }
   Base(int a){
        System.out.println(" i am a base class construction with value as: " +a);
    }

}
class derived extends Base{
    derived(){
        System.out.println("i am derived class constructions");
    }
    derived(int a ,int b){
        super(a);
        System.out.println("i am derived class construction with value as: " +b);
    }
}
class childderived extends derived{
    childderived(){
        System.out.println(" i am a childderived class construction");
    }
    childderived(int a , int b, int c ){
        super(a,b);
        System.out.println(" i am a childderived construction with value as: " +c);
    }
}


public class construction_in_inheritance {
    public static void main(String[] args) {

       // Base b = new Base();
       // derived d = new derived();
      // childderived cd = new childderived();
      //  derived d = new derived(13,78);
      //  childderived cd =  new childderived(34,56,78);


    }
}
