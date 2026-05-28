package com.vansh;

class Myth extends Thread{
    public Myth(String name) {
        super(name);
    }
    public void run(){
        int i=0;
        while (i<10){
            System.out.println("I am a thread");
          i++;
          continue;
        }
    }
}

public class THread_Constructor {
    public static void main(String[] args) {
        Myth t = new Myth("Vansh");
        Myth t2 = new Myth("Hanji");
        t.start();
        System.out.println("The id of thread is "+ t.getId());
        System.out.println(t.getName());
        System.out.println(t2.getName());
        System.out.println(t2.getId());
    }
}
