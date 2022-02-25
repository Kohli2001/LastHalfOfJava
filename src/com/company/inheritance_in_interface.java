package com.company;

interface father{
    void meth1();
    void meth2();
}
interface son extends father{
    void meth3();
    void meth4();
}
class doughter implements son{

    public void meth1() {
        System.out.println("meth1");
    }

   public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}

public class inheritance_in_interface {
    public static void main(String[] args) {
//        doughter beti = new doughter();
//        beti.meth1();
//        beti.meth4();
        father f = new doughter();
      //  f.meth3();
        f.meth1();

    }
    }

