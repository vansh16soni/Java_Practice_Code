package vansh.dsa;

import javax.swing.*;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();

        int[] marks = new int[size];
//        marks[0]=2;
//        marks[1]=9;
//        marks[2]=0;
//        marks[3]=6;

        for(int i=0;i<size;i++){
            marks[i]= sc.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int x= sc.nextInt();

        System.out.println("Numbers are-->");
        for (int i=0;i<size;i++){
            System.out.println(marks[i]);
        }

        for (int i=0;i<size;i++) {
            if(marks[i]==x){
                System.out.println("\nElement found at location "+i+1);
            }
            else System.out.println("Element not present.");
            break;
        }

        System.out.println("END");
    }
}
