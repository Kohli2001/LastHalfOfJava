package com.company;

class noNegativeexception extends Exception{


    @Override
    public String toString() {
        return "negative radius is not valid";
    }

    @Override
    public String getMessage() {
        return "negative radius is  not valid";
    }
}


public class throws_vs_throw {

    public static double area(int r)throws noNegativeexception{
        if (r<0){
            throw new noNegativeexception();
        }
        double result = Math.PI*r*r;
        return result;

    }

    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public  static void main(String[] args) {




        try {

            int c = divide(4,1);
            System.out.println(c);
            double ar = area(-2);
            System.out.println(ar);


        }
        catch (Exception e){
            System.out.println("Eception");
        }



    }
}
