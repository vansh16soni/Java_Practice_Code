package vansh.dsa;

import java.util.Scanner;

public class Total_Path_In_Maze {
    public static void printPaths(int i, int j, int n, int m, String currentPath) {
        if (i == n || j == m) {
            return;
        }

        if (i == n - 1 && j == m - 1) {
            System.out.println(currentPath);
            return;
        }

        printPaths(i + 1, j, n, m, currentPath + "D");

        printPaths(i, j + 1, n, m, currentPath + "R");
    }
    public static int countPath(int i,int j,int n,int m){
        if(i==n||j==m){ return 0;}
        if(i==n-1||j==m-1){return 1;}
        int downpaths=countPath(i+1,j,n,m);
        int rightpath=countPath(i,j+1,n,m);

        return downpaths+rightpath;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows in maze: ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns in maze: ");
        int cols = sc.nextInt();
        int path = countPath(0,0,rows,cols);
        System.out.println("The possible paths are:");

        printPaths(0, 0, rows, cols, "");
        System.out.println("Total Paths in the Maze: "+path);
    }
}
