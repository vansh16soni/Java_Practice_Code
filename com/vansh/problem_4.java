package com.vansh;
import java.util.Scanner;
public class problem_4 {
    public static void main(String[] args) {
//question 1
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the marks: ");
//        int a;
//        a= sc.nextInt();;
//        if(a>=40){
//            System.out.println("Passed");
//        }
//        else if (a>=33&&a<40){
//            System.out.println("passed with grase");
//        }
//        else{
//            System.out.println("Fail");
//        }

        //question 2 income tax
        //question 3
//        int d;
//        System.out.println("enter num");
//        d= sc.nextInt();
//        switch (d){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            default:
//                System.out.println("sooja");
//        }

        //question 4
//        System.out.println("Enter the website: ");
//        String a= sc.nextLine();
//        if(a.endsWith(".org")){
//            System.out.println("Organisation website");
//        }
//        else if(a.endsWith(".com")){
//            System.out.println("commercial website");
//        }
//        else{
//            System.out.println("indian website");
//        }

        //question 5 leap year
        int y;
        System.out.println("Enter th year: ");
        y=sc.nextInt();
        if(y%100==0){
            System.out.println("year is a century");
            if (y%400==0){
                System.out.print(y);
                System.out.println("  is a leap year");
            }
            else System.out.println("Bitch");
        }
        else if(y%4==0){
            System.out.print(y);
            System.out.print("  Year is leap");
        }
        else System.out.println("bitch");
    }
}
