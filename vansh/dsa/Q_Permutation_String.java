package vansh.dsa;

import java.util.Scanner;

public class Q_Permutation_String {
    public static void printPer (String str,String permutation){
        if(str.length()==0){
            System.out.println("Permutations of Given String: "+permutation);
            return;
        }
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            String newStr = str.substring(0,i)+str.substring(i+1);
            printPer(newStr,permutation+ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your String: ");
        String str = sc.nextLine();
        printPer(str,"");
    }
}
