package com.vansh;

public class finally_ {
   public static int greed() {
        try {
            int a = 5;
            int b = 0;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
           System.out.println("end");
       }
       System.out.println("End");
return 0;
    }

    public static void main(String[] args) {
     int k = greed();
        System.out.println(k);
 }
}