package vansh.dsa;

import java.util.Scanner;

public class Array_TwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and column: ");
        int r= sc.nextInt();
        int c=sc.nextInt();

        int [][]mat=new int[r][c];

        System.out.println("Enter the numbers: ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                mat[i][j]= sc.nextInt();
            }
        }

        System.out.print("Enter the num to   be find: ");
        int x = sc.nextInt();

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (mat[i][j]==x){
                    System.out.println("Element found at loc "+i+" "+j);
                }
                else System.out.println("Element not found");
                break;
            }
        }
        System.out.println("Entered matrics is : ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
