package vansh.dsa;

import java.util.Scanner;

public class Merge_Sort {

    public static void divide(int[] arr, int startidx, int endidx) {
        if (startidx >= endidx) {
            return;
        }

        int mid = startidx + (endidx - startidx) / 2;
        divide(arr, startidx, mid);
        divide(arr, mid + 1, endidx);
        conquer(arr, startidx, mid, endidx);
    }

    public static void conquer(int[] arr, int startidx, int mid, int endidx) {
        int[] merged = new int[endidx - startidx + 1];
        int idx1 = startidx;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= endidx) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= endidx) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = startidx; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        printArray(arr);

        divide(arr, 0, arr.length - 1);

        System.out.println("\nSorted Array using Merge Sort:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}