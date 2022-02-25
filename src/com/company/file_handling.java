package com.company;

import java.io.File;
import java.util.logging.FileHandler;

public class file_handling {
    public static void main(String[] args) {
        File myfile = new File("file_handling.txt");
        try {
            myfile.createNewFile();
            System.out.println(myfile);
        }
        catch (Exception e){
            System.out.println("file not found");
            e.fillInStackTrace();
        }




    }
}
