package com.vansh;

class Vansh{
    int n;
    int age;

    public void print(){
        System.out.println("num is "+ n);
        System.out.println("age is "+ age);
    }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("this is a custom class");
        Vansh soni=new Vansh();
        soni.n=90;
        soni.age=6;
        //System.out.println(soni.n);
        //System.out.println(soni.age);
        soni.print();
    }
}
