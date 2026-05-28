package vansh.dsa;

import java.util.Scanner;

public class recursion_basic {
    public static void printNum(int n,int m){
        System.out.println(n);
        if (n==m) return;
        System.out.println(n);
        printNum(n+1,m);
    }

    public static void printSun(int i,int n,int sum){
        if (i==n){
            sum+=i;
            System.out.println(sum);
        }
        sum+=i;
        printSun(i+1,n,sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the num to print");
//        int n=sc.nextInt();
//        System.out.println("Enter the max num");
//        int m= sc.nextInt();
//        printNum(n,m);
        System.out.println("Enter initial value:");
        int i=sc.nextInt();
        System.out.println("Enter the last value:");
        int l=sc.nextInt();
        printSun(i,l,0);

    }
}
