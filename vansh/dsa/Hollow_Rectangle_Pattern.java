package vansh.dsa;
import java.util.*;

public class Hollow_Rectangle_Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many column user want: ");
        int c=sc.nextInt();
        System.out.println("How many row user want: ");
        int r = sc.nextInt();

        for(int i=1;i<=c;i++){
            for(int j =1;j<=r;j++){
                if(i==1||j==1||i==c||j==c){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
