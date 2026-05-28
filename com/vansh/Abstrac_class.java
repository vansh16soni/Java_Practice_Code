package com.vansh;

abstract class Base2{
    public Base2(){
        System.out.println("I am Base constructor");
    }
    public void sayhellp(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Derived2 extends Base2{
    @Override
    public void greet(){
        System.out.println("hola");
    }
}
public class Abstrac_class {
    public static void main(String[] args) {
        Derived2 d = new Derived2();
       //System.out.println(d.greet());
    }
}
