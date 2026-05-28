package vansh.dsa;

import java.util.Scanner;

public class BUbble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int l = sc.nextInt();
        int [] num = new int[l] ;
        for (int i=0;i<l;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("UNsorted aarray is:--");
        for (int i=0;i<l;i++){
            System.out.print(num[i]+" ");
        }
        for (int i=0;i<l-1;i++){
            for (int j=0;j<l-i-1;j++){
                if(num[j]>num[j+1]){
                    int k=num[j];
                    num[j]=num[j+1];
                    num[j+1]=k;
                }
            }
        }
        System.out.println("\nSorted Array is :--");
        for (int i =0;i<l;i++){
            System.out.print(num[i]+" ");
        }
    }
}
