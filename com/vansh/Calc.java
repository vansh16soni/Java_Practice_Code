package com.vansh;
import java.util.Scanner;

public class Calc {
    Scanner sc = new Scanner(System.in);
    public void add(){
        System.out.println("Enter the nums to be add");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int result=a+b;
        System.out.println("The result is "+result);

    }

    public void sub(){

            System.out.println("Enter the nums to be Substract");
            int a= sc.nextInt();
            int b= sc.nextInt();
            int result=a-b;
            System.out.println("The result is "+result);

    }

    public void mul(){
        System.out.println("Enter the nums to be Multiply");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int Product=a*b;
        System.out.println("The result is "+Product);
    }

    public void div(){
        System.out.println("Enter the num to perform Division: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        double Quotient,Remainder;
        try{
            Quotient=a/b;
            Remainder=a%b;
            System.out.println("The quotient is "+Quotient);
            System.out.println("The remainder left is "+Remainder);
        }
        catch (Exception e){
            System.out.println("Error found ->: Denominator cannot be zero");
        }

    }
    public static void main(String[] args) {
        System.out.println("This a Numeric Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add");
        System.out.println("Enter 2 to sub");
        System.out.println("Enter 3 to multiply");
        System.out.println("Enter 4 to divide");
        System.out.println("Enter your choice: ");
        int c= sc.nextInt();
        Calc ca = new Calc();

        switch (c){
            case 1:
                ca.add();
            break;

            case 2:
                ca.sub();
            break;

            case 3:
                ca.mul();
            break;

            case 4:
                ca.div();
            break;

            default:
                System.out.println("Choice is not present.");
        }
    }
}
