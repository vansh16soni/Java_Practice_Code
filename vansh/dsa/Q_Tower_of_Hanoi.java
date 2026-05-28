package vansh.dsa;

import java.util.Scanner;

public class Q_Tower_of_Hanoi {
    public static void TowwerOfHanoi(int n,String sc,String helper,String dest){
        if (n==1){
            System.out.println("Transfer dist "+n+" From "+sc+" to "+dest);
            return;
        }
        TowwerOfHanoi(n-1,sc,helper,helper);
        System.out.println("Transfer dist "+n+" From "+sc+" to "+dest);
        TowwerOfHanoi(n-1,helper,sc,dest);
    }

    public static void main(String[] args) {
        Scanner vc=new Scanner(System.in);
        System.out.println("Enter the NUmber of disk : ");
        int d= vc.nextInt();
        TowwerOfHanoi(d,"s","h","d");

    }
}
