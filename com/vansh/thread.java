package com.vansh;

class  MyThread extends Thread{
    @Override
    public void run(){
        while (true) {
            System.out.println("My thread is runing");
            System.out.println("I am happy");
         }
        }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        while (true) {
            System.out.println("My thread 2 is runing");
            System.out.println("I am sad");
        }
    }
}

public class thread{
    public static void main(String[] args) {
    MyThread T1=new MyThread();
    MyThread2 T2 = new MyThread2();
     T1.start();
     T2.start();
    }
}
