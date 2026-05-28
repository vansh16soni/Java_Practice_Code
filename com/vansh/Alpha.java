package com.vansh;
import java.util.Scanner;

public class Alpha extends Calc{
    public static void main(String[] args) {
        System.out.println("This is a AlphaNumeric Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for Substraction");
        System.out.println("Enter 3 for Multiply");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 5 to add string");
        System.out.println("Enter 6 to convert string to upper case");
        System.out.println("Enter  7 to convert string to lower case");
        System.out.println("Enter your choice: ");
        int c= sc.nextInt();
        sc.nextLine();

        Alpha n = new Alpha();
        switch (c){
            case 1:
                n.add();
                break;

            case 2:
                n.sub();
                break;

            case 3:
                n.mul();
                break;

            case 4:
                n.div();
                break;

            case 5:{
                String a,b;
                System.out.println("Enter the Strings to add: ");
                a= sc.nextLine();
                b= sc.nextLine();
                System.out.println("Your result is-> "+(a+b));
            }
            break;

            case 6:{
                System.out.println("Enter the Strings to be Capatilized: ");
                String a= sc.nextLine();
                String Result=a.toUpperCase();
                System.out.println(Result);
            }
            break;

            case 7:{
                String a;
                System.out.println("Enter the Strings to be in lower: ");
                a= sc.nextLine();
                String Result=a.toLowerCase();
                System.out.println(Result);
            }
            break;

            default:
                System.out.println("End of Choices");
        }
    }
}
