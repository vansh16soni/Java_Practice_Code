package vansh.dsa;
import java.util.Scanner;

public class Fibonacci {
    public static void printFIb(int a,int b,int n){
        if (n == 0) {
            return;
        }
        int c =a+b;
        System.out.println(c);

        printFIb(b,c,n-1);

    }
    public static void main(String[] args) {
        int a=0,b=1;


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total Number of terms: ");
        int n=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        printFIb(a,b,n-2);
    }
}
