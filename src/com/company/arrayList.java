package com.company;
import java.util.*;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(100);
        l1.add(99);
        l1.add(98);
        l1.add(97);
        l1.add(96);
        l1.add(95);

        System.out.println(l1.size());
       l1.add(1,234);
        System.out.println( l1.contains(34));
        System.out.println(l1.isEmpty());
        l1.clear();
           l1.iterator();


        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(" ,");
            
        }


    }
}
