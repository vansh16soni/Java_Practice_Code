package com.vansh;

class THread1 implements Runnable{
    public void run(){
        int i=0;
        while (i<10) {
            System.out.println("MY thread one is running");
      i++;  }
    }
}
class THread2 implements Runnable{
    public void run(){
        int i=0;
        while (i<10){
            System.out.println("MY thread 2 is running");
            i++;
        }
    }
}
public class Thread_IMplemen_Rnnable {
    public static void main(String[] args) {
        THread1 t = new THread1();
        THread2 t2 = new THread2();
        t.run();
        t2.run();
    }
}
