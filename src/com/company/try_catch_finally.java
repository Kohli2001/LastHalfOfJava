package com.company;

public class try_catch_finally {
    public static void main(String[] args) {

        boolean flag = true;
        try {

            while (flag){

                System.out.println("hey dear");
                flag = false;

            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("i am always print no matter ur programm extuate or not ");
        }
    }
}
