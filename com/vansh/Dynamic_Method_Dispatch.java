package com.vansh;

class one{
    public void Greet(){
        System.out.println("GM");
    }
    public void name(){
        System.out.println("My name is one");
    }
}
class two extends one{
    public void Welcome(){
        System.out.println("your Welcome");
    }
    public void name(){
        System.out.println("My name is one in two");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
       // one o=new one();
        //two  t=new two();
        //o.Greet();

        one o =new two();
        //two t=new one(); not allowed;
        o.Greet();
        o.name();
    }
}
