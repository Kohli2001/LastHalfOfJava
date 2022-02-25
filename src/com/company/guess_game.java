package com.company;
import java.util.Random;
import java.util.Scanner;

class  Game{
    int number;
    int numberOfGuesses =0;
    int inputNumber;

    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }


    Game(){
        Random rand = new Random(100);
        this.number=rand.nextInt();

    }
    void takeUserInput(){
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        numberOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes! you guessed it right ,it was %d\nyou guess it in %d attemps " , number,numberOfGuesses);
            return true;
        }
        else if (inputNumber<number){
            System.out.println("its too low....");
        }
        else if (inputNumber>number){
            System.out.println("its too high....");
        }
        return false;


    }
}

public class guess_game {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b){
           g.takeUserInput();
           b = g.isCorrectNumber();

       }


    }
}
