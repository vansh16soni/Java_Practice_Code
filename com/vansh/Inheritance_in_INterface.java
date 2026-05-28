package com.vansh;

interface sampleinterface{
    void meth1();
    void meth2();
}
interface childsample extends sampleinterface{
    void meth3();
    void meth4();
}
class MYsampleclass implements childsample{
    public void meth3(){
        System.out.println("Meth3");
    }
    public void meth4(){
        System.out.println("Meth4");
    }
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
}
public class Inheritance_in_INterface {
    public static void main(String[] args) {
        MYsampleclass s=new MYsampleclass();
        s.meth1();
    }
}
