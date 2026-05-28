package vansh.dsa;

import java.util.*;

public class Q_Remove_Duplicate {

    public static boolean[] map = new boolean[26];

    public static void removeDup(String a, int idx, String newa) {
        if (idx == a.length()) {
            System.out.println(newa);
            return;
        }
        char cur = a.charAt(idx);
        if (map[cur - 'a']) {
            removeDup(a, idx + 1, newa);
        } else {
            newa += cur;
            map[cur - 'a'] = true;
            removeDup(a, idx + 1, newa);
        }
    }

    public static void main(String[] args) {
        Scanner vc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = vc.nextLine();

        Arrays.fill(map, false); // reset before use
        removeDup(s, 0, "");
    }
}
