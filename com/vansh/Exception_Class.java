package com.vansh;

import java.util.Scanner;

class MYException extends Exception{
    @Override
    public String toString(){
        return "I am toString()";
    }
    @Override
    public String getMessage(){
        return "I am getting message";
    }

}
public class Exception_Class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        if(a<9){
            try {
                throw new MYException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                System.out.println("Finished");
                e.printStackTrace();
            }
        }
        System.out.println("End");
    }
}
