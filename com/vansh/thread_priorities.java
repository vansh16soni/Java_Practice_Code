package com.vansh;

class Myth1 extends Thread{
    public Myth1(String name) {
        super(name);
    }
    public void run(){
        int i=0;
        while (i<100){
            System.out.println("I am a thread "+this.getName());
        }
    }
}
public class thread_priorities {
    public static void main(String[] args) {
        Myth1 t1 = new Myth1("vansh1 (least imp)");
        Myth1 t2 = new Myth1("vansh2");
        Myth1 t3 = new Myth1("vansh3");
        Myth1 t4 = new Myth1("vansh4");
        Myth1 t5 = new Myth1("vansh5 (most imp)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
