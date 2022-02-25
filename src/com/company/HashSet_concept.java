package com.company;

import java.util.HashSet;

public class HashSet_concept {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        HashSet<Integer> hs = new HashSet<>(20, 1.5f);
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(6);
        h.add(7);
        h.add(8);
        h.add(9);
        h.add(10);
        h.add(11);
        h.add(12);
        h.add(13);
        h.add(14);
        h.add(15);
        h.add(16);
        h.add(17);
        h.add(18);

        h.remove(1);
        System.out.println(h.size());
        System.out.println( h.contains(19));
        System.out.println( h.isEmpty());
       // System.out.println(h.iterator());
        h.clone();
        System.out.println(h);

    }
}
