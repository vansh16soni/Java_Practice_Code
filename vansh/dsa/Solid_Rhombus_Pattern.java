package vansh.dsa;

import java.util.Scanner;

public class Solid_Rhombus_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of column€; ");
        int c = sc.nextInt();

        for (int i=1;i<=c;i++){
            for (int j=1;j<=c-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
