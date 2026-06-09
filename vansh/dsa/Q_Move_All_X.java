package vansh.dsa;

import java.util.Scanner;

public class Q_Move_All_X {
    public static void MoveallX(String s,char x,int idx,int c,String news){
        if (idx==s.length()){
            for (int i=0;i<c;i++){
                news+=x;
            }
            System.out.println("Updated String: "+news);
            return;
        }
        char curr=s.charAt(idx);
        if (curr==x){
            c++;
            MoveallX(s,x,idx+1,c,news);
        }else {
            news+=curr;
            MoveallX(s,x,idx+1,c,news);
        }
    }

    public static void main(String[] args) {
        Scanner vc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s =vc.nextLine();
        System.out.println("Enter the character to move at last: ");
        char x = vc.next().charAt(0);
        MoveallX(s,x,0,0," ");
    }
}
