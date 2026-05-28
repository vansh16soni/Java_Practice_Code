package vansh.dsa;
import java.util.*;

public class Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total row number: ");
        int r = sc.nextInt();

        for (int i = 1;i<=r;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
