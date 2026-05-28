package com.vansh;

class ThreadG extends Thread{
   public void run(){
       int i=0;
       while(i<100){
           System.out.println("Good morning");
           i++;
       }
   }
}
class THreadW extends Thread{
    public void run(){
        int i=0;
        while(i<100){
           try {
               Thread.sleep(200);
           }
           catch (Exception e){
               System.out.println(e);
           }
            System.out.println("Welcome");
            i++;
        }
    }
}
public class Practise_set_Threads {
    public static void main(String[] args) {
        ThreadG g = new ThreadG();
        THreadW w = new THreadW();
        g.setPriority(6);
        System.out.println(g.getPriority());
        System.out.println(Thread.currentThread().getState());
       g.run();
        //w.run();
    }
}
