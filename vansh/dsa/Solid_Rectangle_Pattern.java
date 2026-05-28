package vansh.dsa;

import java.util.*;
public class Solid_Rectangle_Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many column user want: ");
        int c=sc.nextInt();
        System.out.println("How many star in each row user want: ");
        int s=sc.nextInt();

        for (int i=1;i<=c;i++){
            for(int j=1;j<=s;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
