package vansh.dsa;

import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int l = sc.nextInt();
        int[] num = new int[l];
        for (int i = 0; i < l; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("UNsorted aarray is:--");
        for (int i = 0; i < l; i++) {
            System.out.print(num[i] + " ");
        }
        for (int i =0;i<l;i++){
            int current=num[i];
            int j=i-1;
            while (j>=0 && current<num[j]){
                num[j+1]=num[j];
                j--;
            }
            num[j+1]=current;
        }

        System.out.println("\nSorted Array is :--");
        for (int i = 0; i < l; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
