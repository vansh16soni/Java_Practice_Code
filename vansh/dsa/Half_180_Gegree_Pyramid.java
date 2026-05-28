package vansh.dsa;

import java.util.Scanner;

public class Half_180_Gegree_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int c= sc.nextInt();

        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= c - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
            }
    }
}
