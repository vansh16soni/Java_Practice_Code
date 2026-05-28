package vansh.dsa;

import java.util.Scanner;

public class Selection_Sort {
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

        for (int i = 0; i < l - 1; i++) {
            int s = i;
            for (int j = i + 1; j < l; j++) {
                if (num[j] < num[s]) {
                    s = j;
                }
            }
            int k = num[s];
            num[s] = num[i];
            num[i] = k;

        }

        System.out.println("\nSorted Array is :--");
        for (int i = 0; i < l; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
