package com.vansh;

class A{
    public int a;
    public int vansh(){
        return 4;
    }
    public void meth(){
        System.out.println("I am meth pf A");
    }
}
class B extends A{
    @Override
    public void meth(){
        System.out.println("I am meth pf B");
    }
    public void meth2(){
        System.out.println("I am meth2 of B");
    }
}
public class Method_Overridden {
    public static void main(String[] args) {
        A a=new A();
       // a.meth();
        B b=new B();
        b.meth();
    }
}
