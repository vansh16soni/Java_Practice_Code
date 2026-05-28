package vansh.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bucket_Sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array:");
        int l = sc.nextInt();

        int[] num = new int[l];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < l; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("UNsorted array is:--");
        for (int i = 0; i < l; i++) {
            System.out.print(num[i] + " ");
        }


        int max = num[0];
        for (int i = 1; i < l; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }


        ArrayList<Integer>[] bucket = new ArrayList[l];

        for (int i = 0; i < l; i++) {
            bucket[i] = new ArrayList<Integer>();
        }


        for (int i = 0; i < l; i++) {
            int index = (num[i] * l) / (max + 1);
            bucket[index].add(num[i]);
        }


        for (int i = 0; i < l; i++) {
            Collections.sort(bucket[i]);
        }


        int k = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < bucket[i].size(); j++) {
                num[k] = bucket[i].get(j);
                k++;
            }
        }

        System.out.println("\nSorted Array is :--");
        for (int i = 0; i < l; i++) {
            System.out.print(num[i] + " ");
        }
    }
}