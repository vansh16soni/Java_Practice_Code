package vansh.dsa;

import java.util.HashSet;
import java.util.Scanner;

public class Q_Unique_Subset {
    public static void subsequence(String s,int idx,String news,HashSet<String> set){
        if (idx==s.length()){
            if (set.contains(news)){
                return;
            }else {
                System.out.println("Subsets: "+news);
                set.add(news);
                return;
            }
        }
        char curr = s.charAt(idx);

        //to be
        subsequence(s,idx+1,news+curr,set);

        // not to be
        subsequence(s,idx+1,news,set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to find sub: ");
        String x= sc.nextLine();
        subsequence(x,0," ",set);
    }
}
