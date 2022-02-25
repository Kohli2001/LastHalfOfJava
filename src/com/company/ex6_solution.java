package com.company;
import javax.crypto.spec.PSource;
import java.util.Scanner;
import java.util.SortedMap;

class InvalidInputException extends  Exception{
    @Override
    public String toString() {
        return " cant perfomed with 8 and 9, invalid input";
    }

    @Override
    public String getMessage() {
        return "i am getMessage";

    }
}
class DivideException extends  Exception{
@Override
public String toString() {
        return "cant divide by zero  invalid input";
        }

@Override
public String getMessage() {
        return " i am getMessage";

        }
}

class calculator {
    double sum =0;

    double add(double num1 , double num2)throws InvalidInputException{
        if (num1==8 || num2==9){
            System.out.println("cant do any  operation with 8 and 9");
        }
        sum=sum+num1+num2;
        return sum;
    }
    double sub(double num1 , double num2){
        return num1-num2;
    }
    double mul(double num1 , double num2){
        return  num1*num2;
    }
    double div(double num1 , double num2)throws DivideException{
        if (num2==0){
            throw new DivideException();
        }
        return num1/num2;
    }
}
public class ex6_solution {
    public static void main(String[] args) throws InvalidInputException,DivideException{

        calculator cal = new calculator();
        cal.add(2,8);
        System.out.println(cal);
//        cal.div(3,0);

//




    }
}
