package vansh.dsa;

import java.util.Scanner;

public class Q_Place_Tiles {
    public static void printTilePatterns(int n, int m, String currentPattern) {

        if (n == 0) {
            System.out.println(currentPattern);
            return;
        }

        if (n < 0) {
            return;
        }

        printTilePatterns(n - 1, m, currentPattern + "H ");

        printTilePatterns(n - m, m, currentPattern + "V ");
    }
    public static int placeTiles(int n,int m){
        if(n==m){return 2;}
        if(n<m){return 1;}

        int vertPlace = placeTiles(n-m,m);
        int hortPlace = placeTiles(n-1,m);

        return vertPlace + hortPlace;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Room: ");
        int n=sc.nextInt();
        int m=sc.nextInt();

        int tile = placeTiles(n,m);
        System.out.println("Patten of the placement: "+tile);
        printTilePatterns(n,m,"");
    }
}
