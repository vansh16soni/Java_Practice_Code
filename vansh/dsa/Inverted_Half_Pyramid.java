package vansh.dsa;
import java.util.Scanner;

public class Inverted_Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total row number: ");
        int r = sc.nextInt();

        for (int i = r;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
