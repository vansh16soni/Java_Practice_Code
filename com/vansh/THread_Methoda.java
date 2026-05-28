package com.vansh;

class Mynewth1 extends Thread{
    public void run(){
        int i=0;
        while (i<100) {
            System.out.println("I am a thread 1");
            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}

class Mynewth2 extends Thread{
    public void run(){
        int i=0;
        while (i<100) {
            System.out.println("I am a thread 2 ");
            i++;
        }
    }
}
public class THread_Methoda {
    public static void main(String[] args) {
        Mynewth1 t1 = new Mynewth1();
        Mynewth2 t2 = new Mynewth2();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        t2.start();

    }
}
