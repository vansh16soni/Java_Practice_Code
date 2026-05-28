package com.vansh;

interface Bicycle {
    int a=45;
    void applyBreak(int decrement);

    void speedUp(int increment);
}

class AvonCycle implements Bicycle{
    void Blowhorn(){
        System.out.println("pee poo");
    }
   public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }
    public void speedUp(int increment){
        System.out.println("Applying Speed");
    }
}
public class Interface {
    public static void main(String[] args) {
    AvonCycle a=new AvonCycle();
        System.out.println(a.a);
        a.speedUp(4);
    }
}
