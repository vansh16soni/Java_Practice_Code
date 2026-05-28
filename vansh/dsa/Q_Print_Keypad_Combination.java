package vansh.dsa;

import java.util.Scanner;

public class Q_Print_Keypad_Combination {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};

    public static void printCom(String s,int idx,String Combination){
        if (idx==s.length()){
            System.out.println(Combination);
            return;
        }

        char curr = s.charAt(idx);
        String maping = keypad[curr-'0'];

        for (int i=0;i<maping.length();i++){
            printCom(s,idx+1,Combination+maping.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to traverse");
        String s = sc.next();
        printCom(s,0," ");
    }
}
