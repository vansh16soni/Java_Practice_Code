package vansh.dsa;

import java.util.Scanner;

public class Binary_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter thr number of column: ");
        int c= sc.nextInt();

        for (int i=1;i<=c;i++){
            for (int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print(1+" ");
                }
                else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
