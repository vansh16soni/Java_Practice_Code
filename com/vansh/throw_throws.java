package com.vansh;

public class throw_throws {
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
            int c =divide(3,0);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Exception");
            System.out.println(e);
        }
    }
}
