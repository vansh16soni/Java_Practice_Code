package com.vansh;

public class Method_overloading {
    static void foo(){
        System.out.println("Fuck you");
    }
    static void foo(int a){
        System.out.println("fuck you "+ a + " times Shivam");
    }
    static void foo(int a,int b){
        System.out.println("fuck you "+ a + " times Shivam");
        System.out.println("maa chuda "+ b +" shivam");
    }
    public static void main(String[] args) {
        foo();
        foo(4);
        foo(4,6);

    }
}

