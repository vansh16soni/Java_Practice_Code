package com.vansh;

public class Try {
    public static void main(String[] args) {
        int a=6000;
        int b=0;
        try {
            int c = a / b;
            System.out.println("Result "+c);
        }
        catch (Exception e){
            System.out.println("Failed to divide, reason: ");
            System.out.println(e);
        }
        System.out.println("end");
    }
}
