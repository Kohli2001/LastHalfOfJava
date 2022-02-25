package com.company;
import java.util.Scanner;

class Library{

    String [] availableBook;
    String [] issueBook;

    public void addBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Add any books");
        String book = sc.nextLine();

    }
    public void issueBook(){

    }
    public void returnBook(){

    }
    public void showAvailableBook(){

    }
}

public class exrecise4_library {
    public static void main(String[] args) {

        Library bookLibrary = new Library();
        bookLibrary.addBook();

    }
}
