package com.vansh;
import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
//        int age =18;
//        if(age<=18){
//            System.out.println("yes u can drive");
//        }
//        else{
//            System.out.println("u cant");
//        }
        int age;
        System.out.println("Enter your age : ");
        Scanner sc=new Scanner(System.in);
        age = sc.nextInt();
        switch (age) {
            case 18 -> System.out.println("you r going to become an adult");
            case 21 -> System.out.println("u r going to get a job");
            case 60 -> System.out.println("buddha");
            default -> System.out.println("nothing");
        }

    }
}
