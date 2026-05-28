package vansh.dsa;

import java.util.Scanner;

public class Q_Subsequence_Problem {
    public static void subsequence(String s,int idx,String news){
        if (idx==s.length()){
            System.out.println(news);
            return;
        }
        char curr = s.charAt(idx);

        //to be
        subsequence(s,idx+1,news+curr);

        // not to be
        subsequence(s,idx+1,news);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to find sub: ");
        String x= sc.nextLine();
        subsequence(x,0," ");
    }
}
