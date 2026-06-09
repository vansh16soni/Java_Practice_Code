package vansh.dsa;

import java.util.Scanner;

public class Q_Find_Occurence {
    public static int First=-1;
    public static int Last=-1;

    public static void FindOcc(String s, int idx, char element){
        if (idx==s.length()){
            System.out.println("First Occurence: "+First);
            System.out.println("Last Occurence: "+Last);
            return;
        }

        char curr=s.charAt(idx);
        if (curr == element) {
            if (First == -1) {
                First = idx;
                Last = idx;
            } else {
                Last = idx;
            }
        }
        FindOcc(s,idx+1,element);
    }

    public static void main(String[] args) {
        Scanner vc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s =vc.nextLine();
        System.out.println("Enter the a character u want to search: ");
        char c=vc.next().charAt(0);
        FindOcc(s,0,c);
    }
}
