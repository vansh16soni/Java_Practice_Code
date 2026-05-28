package com.vansh;
import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);

        System.out.println("Enter Km: ");
        float k=sc.nextInt();
        float m=k*1.5f;
        System.out.print("Miles: ");
        System.out.println(m);
    }
}
