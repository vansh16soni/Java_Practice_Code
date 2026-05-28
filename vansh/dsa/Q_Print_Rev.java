package vansh.dsa;

import java.util.Scanner;

public class Q_Print_Rev {
    public static void PrintRev(String s,int idx){
        if (idx==0){
            System.out.print(s.charAt(idx)+" ");
            return;
        }
        System.out.print(s.charAt(idx)+" ");
        PrintRev(s,idx-1);
    }

    public static void main(String[] args) {
        Scanner vc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s =vc.nextLine();
        PrintRev(s,s.length()-1);
    }
}
