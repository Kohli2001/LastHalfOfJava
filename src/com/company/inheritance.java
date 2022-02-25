package com.company;


class  Animal{

    public void spaekCat(){
        System.out.println("meow....meow...meow");
    }
    public void speakLizard(){
        System.out.println("tik...tik...tik");
    }
    public void speakFrogs(){
        System.out.println("ttaka...ttaka..");
    }

}
class Dog extends Animal{


    public void SpeakDog(){
        System.out.println("burk...burk...burk");
    }
}



public class inheritance {
    public static void main(String[] args) {
        Dog mintu = new Dog();

        mintu.SpeakDog();
        mintu.speakFrogs();
        mintu.spaekCat();
        mintu.speakLizard();

    }
}
