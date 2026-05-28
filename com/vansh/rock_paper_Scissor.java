package com.vansh;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_Scissor {
    public static void main(String[] args) {
        Scanner vc=new Scanner(System.in);
        char c;

        do {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter 0 for Rock\nEnter 1 for Paper\nEnter 2 for Scissor");
           System.out.println("Entre users choice: ");
           int u = sc.nextInt();
           Random r = new Random();
           int com = r.nextInt(3);
           if (com == 0) {
               System.out.println("Computer is Rock");
           } else if (com == 1) {
               System.out.println("Computer is Paper");
           } else System.out.println("Computer is Scissor");


           if (u == com) {
               System.out.println("Draw");
           } else if (u == 0 && com == 2 || u == 1 && com == 0 || u == 2 && com == 1) {
               System.out.println("Player win");
           } else System.out.println("Computer win");

            System.out.println("do u want rematch");
            c=vc.next().charAt(0);
       }
       while(c=='y');

    }
}
