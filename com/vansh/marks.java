package com.vansh;
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        System.out.println("Enter Marks out of hundred in subs->");
        Scanner sc= new Scanner(System.in);

        System.out.println("English : ");
        int a= sc.nextInt();


        System.out.print("Hindi: ");
        int b=sc.nextInt();


        System.out.print("Maths: ");
        int c=sc.nextInt();


        System.out.println("SSt: ");
        int d=sc.nextInt();


        System.out.println("Science: ");
        int e=sc.nextInt();

        System.out.println("marks in english: ");
        System.out.println(a);
        System.out.println("marks in hindi: ");
        System.out.println(b);
        System.out.println("marks in maths: ");
        System.out.println(c);
        System.out.println("marks in sst: ");
        System.out.println(d);
        System.out.println("marks in science: ");
        System.out.println(e);

        System.out.println("total marks: ");
        int t=a+b+c+d+e;
        System.out.println(t);

        System.out.println("percentage: ");
        float p=(t/500.0f)*100;
        System.out.println(p);
    }
}
