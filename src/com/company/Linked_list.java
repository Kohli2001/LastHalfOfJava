package com.company;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {
    public static void main(String[] args) {



        //most the methods are same from ArrayList .......

        LinkedList<Integer> l = new LinkedList<>();


        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(15);
        l.add(16);
        l.add(17);
        l.removeFirst();
        l.removeLast();
        l.addFirst(345);
        l.addLast(80);
        l.remove(4);
        //l.clear();
        l.clone();
        System.out.println( l.contains(89));
        //l.descendingIterator();
        System.out.println(Arrays.toString(l.toArray()));

        for (int i=0; i<l.size(); i++){
            System.out.print(l.get(i));
            System.out.print(" ,");
        }





    }
}
