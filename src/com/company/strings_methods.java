package com.company;

import java.util.Locale;

public class strings_methods {
    public static void main(String[] args) {
        String name = "Kamlesh";
       // System.out.println(name.toUpperCase());
        //System.out.println(name.toLowerCase());
        //System.out.println(name.substring(1));
        //System.out.println(name.substring(1,6));
       // System.out.println(name.replace('K' , 'A'));
       // String Nontrimed = new String();
        //System.out.println(Nontrimed.trim());
        System.out.println(name.replace("lesh" , "jesh"));
        System.out.println(name.startsWith("jesh"));
        System.out.println(name.endsWith("kam"));
        System.out.println(name.startsWith("Kam"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf(7));

    }



}
