package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Hacker_rank {
//    static Scanner sc = new Scanner(System.in);
//    static  int B = sc.nextInt();
//    static  int H = sc.nextInt();
//    static  boolean flag = false;
//    static {
//        try {
//            if (B <= 0 || H <= 0) {
//                throw new Exception("Breadth and height must be postive");
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }

//   }
   public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        Double d = sc.nextDouble();
//        int  i = sc.nextInt();
//        System.out.println("String " +s);
//        System.out.println("double " +d);
//        System.out.println("integer " +i);
//        scanner.skip("");
//        scanner.close();
//        if (N % 2 == 0 && N <= 2 || N >= 5 && N>20) {
//            System.out.println("Not Weird");
//        } else if (N % 2 == 0 && N <= 6 || N >= 20) {
//            System.out.println("Weird");
//        }
//        else if (N%2!=0){//if (N%2!=0){
//
//                System.out.println("Weird");
//            }

//        Scanner scan = new Scanner(System.in);
//        //System.out.println("enter any string")
//
//        int i = scan.nextInt();
//        double d = scan.nextDouble();
//        scan.nextInt();
//        String s = scan.nextLine();
//
//
//        // Write your code here.
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);

//        System.out.println("enter any number");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        if (num%2==0){
//            System.out.println("it is even number");
//        }
//        else if (num%2==1){
//            System.out.println("it  is an odd number");
//        }
//        System.out.println("enter the your first number");
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        System.out.println("enter your second number");
//        int num2= sc.nextInt();
//        int mul = num1*num2;
//        System.out.println(mul);
//
//        System.out.println("enter any year ");
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        if (year%400==0 && year%100==0 && year%4==0 ){
//            System.out.println("yes it is a leap year " +year);
//        }
//        else {
//            System.out.println("it is not a leap year");
//        }

//        boolean Isvowel=false;
//        System.out.println("enter any character");
//        Scanner sc = new Scanner(System.in);
//        char vowel = sc.next().charAt(0);
//        switch (vowel) {
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//            case 'A':
//            case 'I':
//            case 'E':
//            case 'O':
//            case 'U':
//                Isvowel = true;
//        }
//        if (Isvowel){
//            System.out.println("this is a vowel character: " +vowel);
//        }
//        else {
//            System.out.println("this is a consonant char : " +vowel);
//        }

//
//        System.out.println("enter the principle amount");
//        Scanner sc = new Scanner(System.in);
//        float p = sc.nextFloat();
//        System.out.println("enter the rate");
//        float r = sc.nextFloat();
//        System.out.println("enter the time");
//        float t = sc.nextFloat();
//
//        double CompoundIntrest = p*(1+r/100)*t;
//        System.out.println("the compund interst is : " +CompoundIntrest);


//        System.out.println("intial principle balance");
//        Scanner sc = new Scanner(System.in);
//        double p = sc.nextDouble();
//        System.out.println("anuual  intrest rate ");
//        double r = sc.nextDouble();
//        System.out.println("time");
//        double t = sc.nextDouble();
//        double A = p*(1+r*t)/100;
//        System.out.println("the final amount is " +A);

        // to find quotient and remainder
//        System.out.println("enetr dividend");
//        Scanner sc = new Scanner(System.in);
//        float dividend = sc.nextFloat();
//        System.out.println("enter divisor");
//        float divisor = sc.nextFloat();
//        float quoitient = dividend/divisor;
//        float remainder = dividend%divisor;
//        System.out.println(quoitient);
//        System.out.println(remainder);

//        System.out.println("enetr your number");
//       Scanner sc = new Scanner(System.in);
//       int num= sc.nextInt();
//       int square = num*num;
//        System.out.println("the power of the givwn number is = " +square);

        //Strings problems
        //Converting String to Char
//
//        String name = "Kamlesh";
//        for (int i=0; i<name.length(); i++){
//            char ch = name.charAt(i);
//            System.out.println(" position " +i+ " character " +ch);
//        }

        //Covertinh char to String
//        char ch = 'a';
//        String st = Character.toString(ch);
//        System.out.println(st);

//        System.out.println("enter your name");
//        Scanner sc = new Scanner(System.in);
//        String st = sc.nextLine();
//        for (int i=0; i<st.length(); i++){
//            char ch = st.charAt(i);
//            System.out.println("position " +i+ "character "+ch);
//        }

//        System.out.println("enter any character");
     //   Scanner sc = new Scanner(System.in);
//        char ch = sc.next().charAt(0);
//        String st = Character.toString(ch);
//        System.out.println("your charcter is: " +st);

//        Scanner sc=new Scanner(System.in);
//        System.out.println("=============================");
//        for(int i=0;i<3;i++){
//            String s1 =sc.next();
//            int x=sc.nextInt();
//            System.out.format("%-15s%03d%n", s1, x);
//            //Complete this line
//        }
//        System.out.println("================================");

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(bufferedReader.readLine().trim());
//
//        bufferedReader.close();
//        for(int i=1; i<=10; i++ ){
//            System.out.format("%d X %d = %d \n" , N,i,N*i);
//        }
//        long x=sc.nextLong();
//        System.out.println(x+" can be fitted in:*long %n" ," *int %n"  " *sort");

//
//       int n =2;
//       for (int i =n; i>=1; i--){
//           System.out.println(n*i);
//





    }
    }
