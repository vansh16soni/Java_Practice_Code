package vansh.dsa;

import java.util.Scanner;

public class Q_Move_All_X {
    public static void MoveallX(String s,int idx,int c,String news){
        if (idx==s.length()){
            for (int i=0;i<c;i++){
                news+='x';
            }
            System.out.println(news);
            return;
        }
        char curr=s.charAt(idx);
        if (curr=='x'){
            c++;
            MoveallX(s,idx+1,c,news);
        }else {
            news+=curr;
            MoveallX(s,idx+1,c,news);
        }
    }

    public static void main(String[] args) {
        Scanner vc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s =vc.nextLine();
        MoveallX(s,0,0," ");
    }
}
