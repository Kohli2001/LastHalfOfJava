package com.company;

import java.util.ArrayList;

class  Mygenerics<T1,T2>{
    int var;
    private T1 t1;
    private T2 t2;

    }


public class generics_java {
    public static void main(String[] args) {


        //all following code is based on only ArrayList

//        ArrayList arrayList = new ArrayList();
//        arrayList.add(45);
//        arrayList.add(78);
//        arrayList.add("string");
//
//        String str = (String)arrayList.get(2);
//        System.out.println(str);
//
//        int a = (int)arrayList.get(0);
//        System.out.println(a);
//        int a2 = (int)arrayList.get(1);
//        System.out.println(a2);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(34);
        arrayList.add(45);
        Integer int2 = arrayList.get(1);
        System.out.println(int2);
      //  arrayList.add("srty")---->> not allowed because u set this as integer

    }
}
